package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

class Add2Numbers_2Test {

    @Test
    void addTwoNumbers1() {
        ListNode listNode1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        Add2Numbers_2  add2Numbers_2 = new Add2Numbers_2();
        ListNode listNode = add2Numbers_2.addTwoNumbers(listNode1,listNode2);
    }

    @Test
    void addTwoNumbers2() {
        ListNode listNode1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode listNode2 = new ListNode(5, new ListNode(6, null));
        Add2Numbers_2  add2Numbers_2 = new Add2Numbers_2();
        ListNode listNode = add2Numbers_2.addTwoNumbers(listNode1,listNode2);
        add2Numbers_2.print(listNode);
    }

    @Test
    void addTwoNumbers3() {
        ListNode listNode1 = new ListNode(9, new ListNode(9, new ListNode(9, null)));
        ListNode listNode2 = new ListNode(9);
        Add2Numbers_2  add2Numbers_2 = new Add2Numbers_2();
        ListNode listNode = add2Numbers_2.addTwoNumbers(listNode1,listNode2);
        add2Numbers_2.print(listNode);
    }
}