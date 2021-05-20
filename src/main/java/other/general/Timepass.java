package other.general;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Timepass {
    public static void main(String[] args) {
       String[] strings = {"A","B","C","D","E","F","G","H","I"}; //k = n, k=n+1, k = n-2
        Set<String> leftOvers = new HashSet<>();
       int k = 7;
        Set<Pair> set = new HashSet<>();
       for (int i = 0; i< strings.length; i++) {
           int firstIndex = i;
           int secondIndex = (i+(k)%strings.length-1)%strings.length-1 + 1;
           Pair pair = new Pair(strings[i], strings[secondIndex]);
           boolean isAdded = false;
           isAdded = set.add(pair); //remove from leftover if a elemet gets added in set

           if(!isAdded) {
            if(!elementContainedInSetOfPairs(set, strings[firstIndex])) leftOvers.add(strings[firstIndex]);
            if(!elementContainedInSetOfPairs(set, strings[secondIndex])) leftOvers.add(strings[secondIndex]);
           }
           else {
               if(leftOvers.contains(strings[firstIndex])) {
                   leftOvers.remove(strings[firstIndex]);
               }
               if(leftOvers.contains(strings[secondIndex])) {
                   leftOvers.remove(strings[secondIndex]);
               }
           }
       }

        int counter = 0;
        Pair leftOverPair = null;
       for(String s: leftOvers) {
           if(counter == 0) leftOverPair = new Pair(s, "No Partner");
           if(counter == 1) leftOverPair.employee2 = s;
           counter++;
       }
       set.add(leftOverPair);
        for (Pair p: set) {
            System.out.println(p);
        }
    }
    private static boolean elementContainedInSetOfPairs(Set<Pair> pairs, String element) {
        for(Pair pair : pairs) {
            if(pair.employee1.equals(element) || pair.employee2.equals(element)) return true;
        }
        return false;
    }
    private static boolean pairElementsContainedInSetOfPairs(Set<Pair> pairs, Pair pairElement) {
        for(Pair pair : pairs) {
            if(pair.employee1.equals(pairElement.employee1) || pair.employee1.equals(pairElement.employee2)
            ||pair.employee2.equals(pairElement.employee1) || pair.employee2.equals(pairElement.employee2))
                return true;
        }
        return false;
    }
}
