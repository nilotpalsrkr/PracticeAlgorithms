package leetcode.dsa.easy;

public class Q70_Climbing_Stairs {
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        if(n>=1)
        memo[1] = 1;
        if(n >=2)
        memo[2] = 2;
        return climb(n, memo);
    }

    private int climb(int n, int[] memo) {
        if(memo[n] != 0 || (n == 0)) return memo[n];

        memo[n] = climb(n-1, memo) + climb(n-2, memo);
        return memo[n];
    }
}
