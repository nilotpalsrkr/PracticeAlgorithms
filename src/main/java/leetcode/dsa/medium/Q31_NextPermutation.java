package leetcode.dsa.medium;

import java.util.Arrays;

public class Q31_NextPermutation {
    public void nextPermutation(int[] nums) {
        int length = nums.length-1;
        int replaceWithIndex = getReplaceWith(nums);
        int secondaryReplaceIndex = -1;
        boolean replacementPossible = false;

       for(int i = replaceWithIndex -1; i>=0 ; i--) {
           if(nums[i]<nums[replaceWithIndex] ) {
               replacementPossible = !replacementPossible;
               swap(nums, replaceWithIndex, nums[secondaryReplaceIndex], i);
               break;
           }
           else {
               secondaryReplaceIndex = i;
           }
       }
       if(!replacementPossible) {
           Arrays.sort(nums);
       }
        print(nums);
    }

    public void print(int[] nums) {
        int length = nums.length;
        System.out.print("[");
        for(int i = 0; i< length; i++) {
            if(i!=length)
            System.out.print(nums[i]+",");
            else System.out.print(nums[i]);
        }
        System.out.print("]");
    }

    public void swap(int[] nums, int replaceWithIndex, int secondaryNum, int i) {
        int temp = nums[i];
        int tempSecondary = nums[secondaryNum];
        nums[i] = nums[replaceWithIndex];
        nums[tempSecondary]= temp;
        nums[replaceWithIndex]= tempSecondary;
    }

    private int getReplaceWith(int[] nums) {
        int i = nums.length - 1;
        while(nums[i]==0 && i>0) {
            i--;
        }
        return i;
    }

}
