package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;
import leetcode.dsa.medium.Q19_Remove_Nth_Node_From_End_of_List.ListNode;

class Q19_Remove_Nth_Node_From_End_of_ListTest {

    @Test
    void removeNthFromEnd() {
        Q19_Remove_Nth_Node_From_End_of_List q19_remove_nth_node_from_end_of_list = new Q19_Remove_Nth_Node_From_End_of_List();

        ListNode listNode = new  Q19_Remove_Nth_Node_From_End_of_List.ListNode();
        listNode.val = 1;
        listNode.next = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null))));

        ListNode result = q19_remove_nth_node_from_end_of_list.removeNthFromEnd(listNode, 2);
        System.out.println(result);
    }

    @Test
    void removeNthFromEnd1() {
        Q19_Remove_Nth_Node_From_End_of_List q19_remove_nth_node_from_end_of_list = new Q19_Remove_Nth_Node_From_End_of_List();

        ListNode listNode = new  Q19_Remove_Nth_Node_From_End_of_List.ListNode();
        listNode.val = 1;
        listNode.next = null;

        ListNode result = q19_remove_nth_node_from_end_of_list.removeNthFromEnd(listNode, 1);
        System.out.println(result);
    }
    @Test
    void removeNthFromEnd2() {
        Q19_Remove_Nth_Node_From_End_of_List q19_remove_nth_node_from_end_of_list = new Q19_Remove_Nth_Node_From_End_of_List();

        ListNode listNode = new  Q19_Remove_Nth_Node_From_End_of_List.ListNode();
        listNode.val = 1;
        listNode.next = new ListNode(2, null);

        ListNode result = q19_remove_nth_node_from_end_of_list.removeNthFromEnd(listNode, 2);
        System.out.println(result);
    }
    @Test
    void removeNthFromEnd3() {
        Q19_Remove_Nth_Node_From_End_of_List q19_remove_nth_node_from_end_of_list = new Q19_Remove_Nth_Node_From_End_of_List();

        ListNode listNode = new  Q19_Remove_Nth_Node_From_End_of_List.ListNode();
        listNode.val = 1;
        listNode.next = new ListNode(2, null);

        ListNode result = q19_remove_nth_node_from_end_of_list.removeNthFromEnd(listNode, 1);
        System.out.println(result);
    }
}