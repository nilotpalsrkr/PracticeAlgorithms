package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q21_Merge_Two_Sorted_ListsTest {

    @Test
    void mergeTwoLists() {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(10)));
        ListNode l2 = new ListNode(2, new ListNode(7));

        Q21_Merge_Two_Sorted_Lists q21_merge_two_sorted_lists = new Q21_Merge_Two_Sorted_Lists();
        ListNode mergedListNodes = q21_merge_two_sorted_lists.mergeTwoLists(l1,l2);
        ;
    }
    @Test
    void mergeTwoLists1() {
        ListNode l1 = new ListNode(100, new ListNode(104, new ListNode(1000)));
        ListNode l2 = new ListNode(2, new ListNode(7));

        Q21_Merge_Two_Sorted_Lists q21_merge_two_sorted_lists = new Q21_Merge_Two_Sorted_Lists();
        ListNode mergedListNodes = q21_merge_two_sorted_lists.mergeTwoLists(l1,l2);
        ;
    }
    @Test
    void mergeTwoLists2() {
        ListNode l1 = null;
        ListNode l2 = new ListNode(2, new ListNode(7));

        Q21_Merge_Two_Sorted_Lists q21_merge_two_sorted_lists = new Q21_Merge_Two_Sorted_Lists();
        ListNode mergedListNodes = q21_merge_two_sorted_lists.mergeTwoLists(l1,l2);
        ;
    }
    @Test
    void mergeTwoLists3() {
        ListNode l2 = null;
        ListNode l1 = new ListNode(2, new ListNode(7));

        Q21_Merge_Two_Sorted_Lists q21_merge_two_sorted_lists = new Q21_Merge_Two_Sorted_Lists();
        ListNode mergedListNodes = q21_merge_two_sorted_lists.mergeTwoLists(l1,l2);
        ;
    }
    @Test
    void mergeTwoLists4() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        Q21_Merge_Two_Sorted_Lists q21_merge_two_sorted_lists = new Q21_Merge_Two_Sorted_Lists();
        ListNode mergedListNodes = q21_merge_two_sorted_lists.mergeTwoLists(l1,l2);
        ;
    }

    @Test
    void mergeTwoLists5() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);

        Q21_Merge_Two_Sorted_Lists q21_merge_two_sorted_lists = new Q21_Merge_Two_Sorted_Lists();
        ListNode mergedListNodes = q21_merge_two_sorted_lists.mergeTwoLists(l1,l2);
        ;
    }

    @Test
    void mergeTwoLists6() {
        ListNode l1 = new ListNode(-2, new ListNode(5));
        ListNode l2 = new ListNode(-9, new ListNode(-6, new ListNode(-3, new ListNode(-1,
                new ListNode(1, new ListNode(6))))));

        Q21_Merge_Two_Sorted_Lists q21_merge_two_sorted_lists = new Q21_Merge_Two_Sorted_Lists();
        ListNode mergedListNodes = q21_merge_two_sorted_lists.mergeTwoLists(l1,l2);
        ;
    }
}