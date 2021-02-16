package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q142_Linked_List_Cycle_IITest {

    @Test
    void detectCycle() {
        ListNode listNode3 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode0 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4, listNode2);

        listNode3.next = listNode2;
        listNode2.next = listNode0;
        listNode0.next = listNode4;

        ListNode head = listNode3;

        Q142_Linked_List_Cycle_II q142_linked_list_cycle_ii = new Q142_Linked_List_Cycle_II();
        ListNode result = q142_linked_list_cycle_ii.detectCycle(head);
        assertEquals(result, listNode2);
    }
}