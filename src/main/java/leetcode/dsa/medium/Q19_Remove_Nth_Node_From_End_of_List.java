package leetcode.dsa.medium;

public class Q19_Remove_Nth_Node_From_End_of_List {


      static public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

      int indexToBeRemoved = -1;
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head == null) return null;
       indexToBeRemoved = n;
       return traverse(head);
    }

    private ListNode traverse(ListNode node) {
        if(node == null){
            return null;
        }
        ListNode nextNode = traverse(node.next);
        node.next = nextNode;
        if(--indexToBeRemoved == 0){
            return nextNode;
        }
        else return node;
    }

       /* public ListNode removeNthFromEnd(ListNode head, int n) {

            int length = 0;
            ListNode temp = head;
            while(temp != null) {
                length++;
                temp = temp.next;

            }
            int indexOfPrevElementToBeRemoved = length - n;
            int tempCounter = 0;

            temp = head;
            indexOfPrevElementToBeRemoved = indexOfPrevElementToBeRemoved-1 >0 ? indexOfPrevElementToBeRemoved -1  : indexOfPrevElementToBeRemoved;
            while(tempCounter!=indexOfPrevElementToBeRemoved) {

                temp = temp.next;
                tempCounter++;
            }
            ListNode nodeTobeRemoved;
            if(indexOfPrevElementToBeRemoved !=0) {
                nodeTobeRemoved  = temp.next;
                if(temp.next != null) {
                    temp.next = nodeTobeRemoved.next;
                }
            }
            else {
                nodeTobeRemoved = temp;
                temp = nodeTobeRemoved.next;
                head = temp;
            }
            return head;

        }*/

}
