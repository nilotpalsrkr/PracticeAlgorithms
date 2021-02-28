package leetcode.dsa.hard;

import java.util.Arrays;
import java.util.OptionalInt;

public class Q32_Longest_Valid_Parentheses {
    public int longestValidParentheses(String s) {

        int[] dp = new int[s.length()];
        int max = 0;

        for(int i = 1; i < s.length() ; i++) {
            if(s.charAt(i) == ')' && s.charAt(i-1) == '(') {
                dp[i] = (i > 2 ? dp[i-2] : 0 ) + 2;
            }
            else if(s.charAt(i) == ')' && s.charAt(i-1) == ')') {

                if(i-dp[i-1] > 0 && s.charAt(i - dp[i-1]-1) == '(') {
                    dp[i] = dp[i-1] + (i - dp[i-1] > 2 ? dp[i-1 - dp[i-1] -1] : 0) + 2;
                }
            }
            max = Math.max(max, dp[i]);

        }

       return max;
    }
    public int longestValidParentheses1(String s) {
        int maxans = 0;
        int dp[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                maxans = Math.max(maxans, dp[i]);
            }
        }
        return maxans;
    }
}
