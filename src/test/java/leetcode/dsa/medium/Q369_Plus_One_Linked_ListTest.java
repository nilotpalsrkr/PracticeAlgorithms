package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q369_Plus_One_Linked_ListTest {

    @Test
    void plusOne() {
        ListNode listNode = new ListNode(1,new ListNode(2, new ListNode(3)));
        Q369_Plus_One_Linked_List q369_plus_one_linked_list = new Q369_Plus_One_Linked_List();

        q369_plus_one_linked_list.plusOne(listNode);


    }
    @Test
    void plusOne1() {
        ListNode listNode = new ListNode(3,new ListNode(9, new ListNode(9)));
        Q369_Plus_One_Linked_List q369_plus_one_linked_list = new Q369_Plus_One_Linked_List();

        q369_plus_one_linked_list.plusOne(listNode);


    }
    @Test
    void plusOne2() {
        ListNode listNode = new ListNode(1,new ListNode(2, new ListNode(3)));
        Q369_Plus_One_Linked_List q369_plus_one_linked_list = new Q369_Plus_One_Linked_List();

        q369_plus_one_linked_list.plusOne(listNode);


    }
    @Test
    void plusOne3() {
        ListNode listNode = new ListNode(9,new ListNode(9, new ListNode(9)));
        Q369_Plus_One_Linked_List q369_plus_one_linked_list = new Q369_Plus_One_Linked_List();

        ListNode result = q369_plus_one_linked_list.plusOne(listNode);


    }
}