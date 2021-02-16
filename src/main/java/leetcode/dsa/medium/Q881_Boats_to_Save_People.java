package leetcode.dsa.medium;

import java.util.*;

public class Q881_Boats_to_Save_People {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int boats = 0;

        while (i <= j) {
            ++boats;
            if(people[i] + people[j] <= limit) {
                i++;
            }
            j--;

        }

        return boats;
    }



    private int numRescueBoats1(int[] people, int limit, int limitReachedAsYet, int counter, Integer numOfBoats) {

        if(counter > people.length-1) return numOfBoats;
        else {
            while(limitReachedAsYet + people[counter] <= limit && counter< people.length) {
                limitReachedAsYet = limitReachedAsYet + people[counter];

                if(counter + 1 < people.length) counter++; else {counter++; break;}
            }
            if(limitReachedAsYet <= limit) {
                numOfBoats++;
            }
            return numRescueBoats1(people, limit, 0, counter, numOfBoats);
        }
    }
}
