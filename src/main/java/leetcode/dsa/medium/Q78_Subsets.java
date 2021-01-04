package leetcode.dsa.medium;

import java.util.ArrayList;
import java.util.List;

public class Q78_Subsets {

    public List<List<Integer>> subsets1(int[] nums) {

        int sizeOfPowerSet = (int)Math.pow(2, nums.length);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < sizeOfPowerSet; i++) {
            List<Integer> elements = new ArrayList<>();
            for (int j = 0; j < nums.length ; j++) {
                if((i & (1 << j)) > 0) {
                    elements.add(nums[j]);
                }
            }
            result.add(elements);

        }
        return result;
    }

    /*
    * Using Recursion and backtracking
    * */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(nums, result, 0, new ArrayList<Integer>());
        return result;
    }
    private void backtracking(int[] nums, List<List<Integer>> result, int index, List<Integer> temp){
        result.add(new ArrayList<Integer>(temp));
        for (int i = index; i < nums.length; i++){
            temp.add(nums[i]);
            backtracking(nums, result, i+1, temp);
            temp.remove(temp.size() -1);
        }
    }
}
