package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q88_Merge_Sorted_ArrayTest {

    @Test
    void merge() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        Q88_Merge_Sorted_Array q88_merge_sorted_array = new Q88_Merge_Sorted_Array();
        q88_merge_sorted_array.merge(nums1, 3, nums2, nums2.length);
        assertArrayEquals(nums1, new int[]{1,2,2,3,5,6});

    }
    @Test
    void merge2() {
        int[] nums1 = {1,2,3,4,0,0,0};
        int[] nums2 = {2,5,6};

        Q88_Merge_Sorted_Array q88_merge_sorted_array = new Q88_Merge_Sorted_Array();
        q88_merge_sorted_array.merge(nums1, 4, nums2, nums2.length);
        assertArrayEquals(nums1, new int[]{1,2,2,3,4,5,6});

    }
    @Test
    void merge3() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {1,2,3};

        Q88_Merge_Sorted_Array q88_merge_sorted_array = new Q88_Merge_Sorted_Array();
        q88_merge_sorted_array.merge(nums1, 3, nums2, nums2.length);
        assertArrayEquals(new int[]{1,1,2,2,3,3}, nums1);

    }
    @Test
    void merge4() {
        int[] nums1 = {0};
        int[] nums2 = {1};

        Q88_Merge_Sorted_Array q88_merge_sorted_array = new Q88_Merge_Sorted_Array();
        q88_merge_sorted_array.merge(nums1, 0, nums2, nums2.length);
        assertArrayEquals(new int[]{1}, nums1);

    }
    @Test
    void merge5() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {4,5,6};

        Q88_Merge_Sorted_Array q88_merge_sorted_array = new Q88_Merge_Sorted_Array();
        q88_merge_sorted_array.merge(nums1, 3, nums2, nums2.length);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, nums1);

    }
}