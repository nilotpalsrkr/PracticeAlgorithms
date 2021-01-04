package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

class Q78_SubsetsTest {

    @Test
    void subsets() {
        int[] nums = { 1,2 ,3};
        Q78_Subsets q78_subsets = new Q78_Subsets();
        List<List<Integer>> result = q78_subsets.subsets(nums);
        System.out.println(result);
    }
}