package leetcode.dsa.easy;

public class Q1688_Count_of_Matches_in_Tournament {
    public int numberOfMatches1(int n) {

        if(n == 2) {
            return n/2;
        }
        else return (int)Math.floor((double)n/2) + numberOfMatches1((int)(Math.ceil((double)(n)/2)));

    }

    public int numberOfMatches(int n) {

        if(n == 2) {
            return n/2;
        }
        else if(n%2 == 0){
            return (n/2) + numberOfMatches(n/2);
        }
        else {
            return (n-1)/2 + numberOfMatches((n-1)/2 +1 );
        }


    }


}
