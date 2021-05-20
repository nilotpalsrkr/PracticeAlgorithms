package leetcode.dsa.easy;

public class Q485_Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSumAsYet = 0;
       int maxSumTemp = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) maxSumTemp++;
            else {
                maxSumAsYet = maxSumAsYet > maxSumTemp ? maxSumAsYet : maxSumTemp;
                maxSumTemp = 0;
            }
        }
        maxSumAsYet = maxSumAsYet > maxSumTemp ? maxSumAsYet : maxSumTemp;
        return maxSumAsYet;
    }
}
