package coursera.compettive_programming_for_beginners.dp;

public class TheHopperProblem {
    int[] dp;
    public int hopToFindMaxValue(int[] arr) {
        dp = new int[arr.length + 1];
        dp[0] = 0;
        if(arr.length > 0)
        dp[1] = arr[0];

        for(int i = 2; i<= arr.length ; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2]) + arr[i-1];
        }
        return dp[arr.length];
    }
    public int hopToFindMaxValueWithNoDp0(int[] arr) {
        dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = dp[0] + arr[1];

        for(int i = 2; i< arr.length ; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2]) + arr[i];
        }
        return dp[arr.length-1];
    }
}
