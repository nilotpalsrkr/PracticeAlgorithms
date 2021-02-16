package leetcode.dsa.medium;


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Q82_Remove_Duplicates_from_Sorted_List_II {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode tempHead = head;
        ListNode startOfDuplicateNode = tempHead;
            if (tempHead!=null)
                tempHead = tempHead.next;
            else {
                return null;
            }
        ListNode endOfDuplicateNode = null;
        ListNode preToStartHead = null;
        boolean duplicateDetected = false;

        if(tempHead!=null) {
            while (tempHead.next != null) {

                if (startOfDuplicateNode.val == tempHead.val) {

                    endOfDuplicateNode = tempHead;
                    duplicateDetected = true;
                } else {

                    if (duplicateDetected && preToStartHead != null) {
                        preToStartHead.next = endOfDuplicateNode.next;
                        duplicateDetected = false;
                        startOfDuplicateNode = tempHead;
                    } else if (duplicateDetected) {
                        head = endOfDuplicateNode.next;
                        duplicateDetected = false;
                        startOfDuplicateNode = tempHead;
                    } else {
                        preToStartHead = startOfDuplicateNode;
                        startOfDuplicateNode = tempHead;
                    }
                }

                tempHead = tempHead.next;
            }
            if (duplicateDetected) {
                if (preToStartHead != null)
                    preToStartHead.next = endOfDuplicateNode.next;
                else {
                    head = endOfDuplicateNode.next;
                }
            }
        }
        return head;
    }
}
