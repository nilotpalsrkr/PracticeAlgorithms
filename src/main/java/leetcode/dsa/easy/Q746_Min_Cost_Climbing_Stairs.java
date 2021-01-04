package leetcode.dsa.easy;

public class Q746_Min_Cost_Climbing_Stairs {
    int[] cost;
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        this.cost = cost;
        dp = new int[cost.length];
        for(int i = 0; i< cost.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        if(cost.length > 1)
        return Math.min(minCost(0, 0), minCost(1, 0));
        else return cost[0];
    }

    private int minCost(int i, int sum) {
        if(i>cost.length-1) return sum;
        sum = sum + cost[i];
        if(dp[i] != Integer.MAX_VALUE) return Math.min(dp[i], sum);
        else
            dp[i] = Math.min(dp[i],Math.min(minCost(i+1,sum), minCost(i+2, sum)));
        return dp[i];

    }
}
