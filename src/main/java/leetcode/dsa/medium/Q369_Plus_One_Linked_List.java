package leetcode.dsa.medium;

public class Q369_Plus_One_Linked_List {
    public ListNode plusOne(ListNode head) {
        int firstCarry = add1(head);
        if(firstCarry != 0) {
            ListNode carry = new ListNode(firstCarry, head);
            return carry;
        }
        return head;
    }

    private int add1(ListNode head) {
        if(head == null) return 1;
        else {
            int add = add1(head.next);
            int temp = head.val;
            int div = (head.val + add)%10;
            head.val = div;
            return (temp + add) / 10;
        }
    }
}
