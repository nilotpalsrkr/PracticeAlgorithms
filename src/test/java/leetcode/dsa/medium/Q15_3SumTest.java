package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q15_3SumTest {

    @Test
    void threeSum() {
        int[] nums = {-5,-1,-2,-2,1,2,-1,4};
        Q15_3Sum q15_3Sum = new Q15_3Sum();
        List<List<Integer>> actual = q15_3Sum.threeSum(nums);
        System.out.println(actual);
        assertEquals(2, actual.size());
    }
}


