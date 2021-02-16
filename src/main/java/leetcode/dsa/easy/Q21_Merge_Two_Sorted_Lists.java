package leetcode.dsa.easy;

public class Q21_Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode prev1 = null;
        ListNode head2 = l2;
        ListNode prev2 = null;

        ListNode mergedListNode = null;

        mergedListNode = l1 != null && l2!=null ? (l1.val <= l2.val ? l1 : l2 ) : (l1 == null ) ? l2 : l2 == null ? l1 : l2;
        while(head1 !=null && head2!=null) {

            while((head1!=null && head2!=null) && head1.val <= head2.val) {
                prev1 = head1;
                head1 = head1.next;
            }
            if(prev1!=null) {
                prev1.next = head2;
                prev2 = null;
            }

            while((head2!=null && head1!=null) && (head2.val <= head1.val)) {
                prev2 = head2;
                head2 = head2.next;
            }
            if(prev2!=null) {
                prev2.next = head1;
                prev1 = null;
            }
        }



        return mergedListNode;
    }
}
