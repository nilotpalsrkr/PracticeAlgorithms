package leetcode.dsa.easy;
/*
* /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Add2Numbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum = ((l1!=null?l1.val:0) + (l2!=null?l2.val : 0))%10;
        int l1Val = l1!=null?l1.val : 0;
        int l2Val = l2!=null?l2.val : 0;
        int rem =  (l1Val + l2Val)/10;
        ListNode sumNode = new ListNode(sum);
        ListNode finalSumNode = sumNode;
        if(l1!=null) l1 = l1.next;
        if(l2!=null) l2 = l2.next;
        while(l1 != null || l2 != null || rem>0) {
            l1Val = l1!=null?l1.val : 0;
            l2Val = l2!=null?l2.val : 0;
            ListNode listNodeSum = new ListNode((l1Val + l2Val + rem)%10);
            sumNode.next = listNodeSum;
            sumNode = sumNode.next;
            rem =  (l1Val + l2Val + rem)/10;
            l1 = l1!=null?l1.next:null;
            l2 = l2!=null?l2.next:null;
        }
        return finalSumNode;
    }
    public void print(ListNode listNode) {
        while(listNode!=null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
