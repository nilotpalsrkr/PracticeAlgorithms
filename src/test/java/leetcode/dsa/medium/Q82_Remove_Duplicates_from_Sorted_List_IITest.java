package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q82_Remove_Duplicates_from_Sorted_List_IITest {

    @Test
    void deleteDuplicates() {
        ListNode headNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))));
        Q82_Remove_Duplicates_from_Sorted_List_II q82_remove_duplicates_from_sorted_list_ii = new Q82_Remove_Duplicates_from_Sorted_List_II();

        ListNode resultHead = q82_remove_duplicates_from_sorted_list_ii.deleteDuplicates(headNode);
        assertEquals(resultHead.val, 1);

    }
    @Test
    void deleteDuplicates2() {
        ListNode headNode = new ListNode(2, new ListNode(2, new ListNode(3)));
        Q82_Remove_Duplicates_from_Sorted_List_II q82_remove_duplicates_from_sorted_list_ii = new Q82_Remove_Duplicates_from_Sorted_List_II();

        ListNode resultHead = q82_remove_duplicates_from_sorted_list_ii.deleteDuplicates(headNode);
        assertEquals(resultHead.val, 3);

    }
    @Test
    void deleteDuplicates3() {
        ListNode headNode = new ListNode(2);
        Q82_Remove_Duplicates_from_Sorted_List_II q82_remove_duplicates_from_sorted_list_ii = new Q82_Remove_Duplicates_from_Sorted_List_II();

        ListNode resultHead = q82_remove_duplicates_from_sorted_list_ii.deleteDuplicates(headNode);
        assertEquals(resultHead.val, 2);

    }
    @Test
    void deleteDuplicates4() {
        ListNode headNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))));
        Q82_Remove_Duplicates_from_Sorted_List_II q82_remove_duplicates_from_sorted_list_ii = new Q82_Remove_Duplicates_from_Sorted_List_II();

        ListNode resultHead = q82_remove_duplicates_from_sorted_list_ii.deleteDuplicates(headNode);
        assertEquals(getNodeAtIndex(resultHead, 1).val, 3);

    }
    @Test
    void deleteDuplicates5() {
        ListNode headNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(3)))));
        Q82_Remove_Duplicates_from_Sorted_List_II q82_remove_duplicates_from_sorted_list_ii = new Q82_Remove_Duplicates_from_Sorted_List_II();

        ListNode resultHead = q82_remove_duplicates_from_sorted_list_ii.deleteDuplicates(headNode);
        assertEquals(getNodeAtIndex(resultHead, 1), null);

    }
    @Test
    void deleteDuplicates6() {
        ListNode headNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(3
        ,new ListNode(4, new ListNode(4, new ListNode(5))))))));
        Q82_Remove_Duplicates_from_Sorted_List_II q82_remove_duplicates_from_sorted_list_ii = new Q82_Remove_Duplicates_from_Sorted_List_II();

        ListNode resultHead = q82_remove_duplicates_from_sorted_list_ii.deleteDuplicates(headNode);
        assertEquals(getNodeAtIndex(resultHead, 1).val, 5);

    }
    @Test
    void deleteDuplicates7() {
        ListNode headNode = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3)))));
        Q82_Remove_Duplicates_from_Sorted_List_II q82_remove_duplicates_from_sorted_list_ii = new Q82_Remove_Duplicates_from_Sorted_List_II();

        ListNode resultHead = q82_remove_duplicates_from_sorted_list_ii.deleteDuplicates(headNode);
        assertEquals(getNodeAtIndex(resultHead, 1).val, 3);

    }
    @Test
    void deleteDuplicates8() {
        ListNode headNode = null;
        Q82_Remove_Duplicates_from_Sorted_List_II q82_remove_duplicates_from_sorted_list_ii = new Q82_Remove_Duplicates_from_Sorted_List_II();

        ListNode resultHead = q82_remove_duplicates_from_sorted_list_ii.deleteDuplicates(headNode);
        assertEquals(getNodeAtIndex(resultHead, 0), null);

    }
    @Test
    public void testGetNodeAtIndex() {
        ListNode headNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))));
        ListNode result = getNodeAtIndex(headNode,1);
        assertEquals(result.val, 2);

    }
    @Test
    public void testGetNodeAtIndex2() {
        ListNode headNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))));
        ListNode result = getNodeAtIndex(headNode,0);
        assertEquals(result.val, 1);

    }
    @Test
    public void testGetNodeAtIndex3() {
        ListNode headNode = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))));
        ListNode result = getNodeAtIndex(headNode,9);
        assertNull(result);

    }
    public ListNode getNodeAtIndex(ListNode headNode , int index) {
        int c = 0;

        while(c++ < index) {
            if(headNode!=null)
            headNode = headNode.next;
        }
        return headNode;
    }
}