package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

class Q31_NextPermutationTest {

    @Test
    void nextPermutation1() {
        int[] nums = {1,2,3};
        Q31_NextPermutation q31_nextPermutation = new Q31_NextPermutation();
        q31_nextPermutation.nextPermutation(nums);

    }
    @Test
    void nextPermutation2() {
        int[] nums = {3,2,1};
        Q31_NextPermutation q31_nextPermutation = new Q31_NextPermutation();
        q31_nextPermutation.nextPermutation(nums);

    }
    @Test
    void nextPermutation3() {
        int[] nums = {1,1,5};
        Q31_NextPermutation q31_nextPermutation = new Q31_NextPermutation();
        q31_nextPermutation.nextPermutation(nums);

    }
    @Test
    void nextPermutation4() {
        int[] nums = {1,2};
        Q31_NextPermutation q31_nextPermutation = new Q31_NextPermutation();
        q31_nextPermutation.nextPermutation(nums);

    }
    @Test
    void nextPermutation5() {
        int[] nums = {1,3,2};
        Q31_NextPermutation q31_nextPermutation = new Q31_NextPermutation();
        q31_nextPermutation.nextPermutation(nums);

    }

    @Test
    void testSwap() {
        int[] nums = {1,3,2};
        Q31_NextPermutation q31_nextPermutation = new Q31_NextPermutation();
        q31_nextPermutation.swap(nums, 2, 1,0);
        q31_nextPermutation.print(nums);
    }
}