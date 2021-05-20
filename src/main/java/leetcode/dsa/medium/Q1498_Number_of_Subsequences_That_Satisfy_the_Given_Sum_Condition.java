package leetcode.dsa.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Q1498_Number_of_Subsequences_That_Satisfy_the_Given_Sum_Condition {
    int size = 0;
    public int numSubseq(int[] nums, int target) {
        size = nums.length;
        Integer count = 0;
        for(int i = 0; i < nums.length; i++) {
            count = helper(nums,i,i+1, new ArrayList<Integer>(), target, count);
        }
        return count;
    }

    private int helper(int[] nums, int i,int j, ArrayList<Integer> integers, int target, Integer count) {
        if(j <= size ) {
            int[] subArray = Arrays.copyOfRange(nums, i, j);
            if (Arrays.stream(subArray).max().getAsInt() + Arrays.stream(subArray).min().getAsInt() <= target) {
                Arrays.stream(subArray).forEach(x -> System.out.print(x));
                System.out.println();
                count++;

            }
            return helper(nums, i, ++j, integers, target, count);
        }
        else return count;

    }


}
