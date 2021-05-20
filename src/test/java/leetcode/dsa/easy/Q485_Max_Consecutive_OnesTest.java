package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q485_Max_Consecutive_OnesTest {

    @Test
    void findMaxConsecutiveOnes() {
        int[] nums = {1,1,0,1,1,1};
        Q485_Max_Consecutive_Ones q485_max_consecutive_ones = new Q485_Max_Consecutive_Ones();
        int result = q485_max_consecutive_ones.findMaxConsecutiveOnes(nums);
        assertEquals(3, result);
    }
    @Test
    void findMaxConsecutiveOnes1() {
        int[] nums = {1,0,1,1,0,1};
        Q485_Max_Consecutive_Ones q485_max_consecutive_ones = new Q485_Max_Consecutive_Ones();
        int result = q485_max_consecutive_ones.findMaxConsecutiveOnes(nums);
        assertEquals(2, result);
    }
}