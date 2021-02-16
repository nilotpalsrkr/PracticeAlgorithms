package leetcode.dsa.medium;

import java.util.HashSet;
import java.util.Set;

public class Q142_Linked_List_Cycle_II {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodeSets = new HashSet<>();
        ListNode tempNode = head;
        while(tempNode!=null) {
            if(nodeSets.contains(tempNode)) return tempNode;
            nodeSets.add(tempNode);
            tempNode = tempNode.next;
        }
        return null;
    }
}
