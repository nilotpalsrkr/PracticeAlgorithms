package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q141_Linked_List_CycleTest {

    @Test
    void hasCycle() {
        ListNode listNode3 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode0 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4, listNode2);

        listNode3.next = listNode2;
        listNode2.next = listNode0;
        listNode0.next = listNode4;

        ListNode head = listNode3;

        Q141_Linked_List_Cycle q141_linked_list_cycle = new Q141_Linked_List_Cycle();
        boolean result = q141_linked_list_cycle.hasCycle(head);
        assertEquals(true, result);

    }

    @Test
    void hasCycle1() {
        ListNode listNode3 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode0 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4, null);

        listNode3.next = listNode2;
        listNode2.next = listNode0;

        ListNode head = listNode3;

        Q141_Linked_List_Cycle q141_linked_list_cycle = new Q141_Linked_List_Cycle();
        boolean result = q141_linked_list_cycle.hasCycle(head);
        assertEquals(false, result);

    }
    @Test
    void hasCycle2() {
        ListNode listNode3 = new ListNode(3);
        listNode3.next = listNode3;


        ListNode head = listNode3;

        Q141_Linked_List_Cycle q141_linked_list_cycle = new Q141_Linked_List_Cycle();
        boolean result = q141_linked_list_cycle.hasCycle(head);
        assertEquals(true, result);

    }
}