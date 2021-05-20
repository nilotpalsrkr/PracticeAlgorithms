package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1460_Make_Two_Arrays_Equal_by_Reversing_Sub_arraysTest {

    @Test
    void canBeEqual() {
        int[] target = {1,2,3,4};
        int[] arr = {2,4,1,3};

        Q1460_Make_Two_Arrays_Equal_by_Reversing_Sub_arrays q1460_make_two_arrays_equal_by_reversing_sub_arrays = new Q1460_Make_Two_Arrays_Equal_by_Reversing_Sub_arrays();
        q1460_make_two_arrays_equal_by_reversing_sub_arrays.canBeEqual(target,arr);
    }
}