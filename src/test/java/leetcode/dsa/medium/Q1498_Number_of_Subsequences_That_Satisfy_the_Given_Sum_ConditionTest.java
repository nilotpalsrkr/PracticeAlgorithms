package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1498_Number_of_Subsequences_That_Satisfy_the_Given_Sum_ConditionTest {

    @Test
    void numSubseq() {
        int[] nums = {3,5,6,7};
        int target = 9;

        Q1498_Number_of_Subsequences_That_Satisfy_the_Given_Sum_Condition q1498_number_of_subsequences_that_satisfy_the_given_sum_condition =
                new Q1498_Number_of_Subsequences_That_Satisfy_the_Given_Sum_Condition();
        int result = q1498_number_of_subsequences_that_satisfy_the_given_sum_condition.numSubseq(nums, target);
        assertEquals(4, result);
    }
    @Test
    void numSubseq1() {
        int[] nums = {3,3,6,8};
        int target = 10;

        Q1498_Number_of_Subsequences_That_Satisfy_the_Given_Sum_Condition q1498_number_of_subsequences_that_satisfy_the_given_sum_condition =
                new Q1498_Number_of_Subsequences_That_Satisfy_the_Given_Sum_Condition();
        int result = q1498_number_of_subsequences_that_satisfy_the_given_sum_condition.numSubseq(nums, target);
        assertEquals(6, result);
    }
}