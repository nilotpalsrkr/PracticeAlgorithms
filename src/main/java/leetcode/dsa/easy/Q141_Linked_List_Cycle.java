package leetcode.dsa.easy;

import java.util.HashSet;
import java.util.Set;

public class Q141_Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        ListNode listNodeTemp = head;
        while(listNodeTemp !=null) {
            if(nodeSet.contains(listNodeTemp)) return true;
            nodeSet.add(listNodeTemp);
            listNodeTemp = listNodeTemp.next;
        }
        return false;

    }
}
