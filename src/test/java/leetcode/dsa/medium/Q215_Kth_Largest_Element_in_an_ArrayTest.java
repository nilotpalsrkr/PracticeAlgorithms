package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q215_Kth_Largest_Element_in_an_ArrayTest {

    @Test
    void findKthLargest() {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        Q215_Kth_Largest_Element_in_an_Array q215_kth_largest_element_in_an_array = new Q215_Kth_Largest_Element_in_an_Array();
        int result = q215_kth_largest_element_in_an_array.findKthLargest(nums, k);
        assertEquals(4, result);
    }
    @Test
    void findKthLargest1() {
        int[] nums = {3,5,10};
        int k = 2;

        Q215_Kth_Largest_Element_in_an_Array q215_kth_largest_element_in_an_array = new Q215_Kth_Largest_Element_in_an_Array();
        int result = q215_kth_largest_element_in_an_array.findKthLargest(nums, k);
        assertEquals(5, result);
    }
    @Test
    void findKthLargest2() {
        int[] nums = {1};
        int k = 1;

        Q215_Kth_Largest_Element_in_an_Array q215_kth_largest_element_in_an_array = new Q215_Kth_Largest_Element_in_an_Array();
        int result = q215_kth_largest_element_in_an_array.findKthLargest(nums, k);
        assertEquals(1, result);
    }
}