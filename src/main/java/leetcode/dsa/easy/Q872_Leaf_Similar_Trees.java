package leetcode.dsa.easy;


import java.util.LinkedList;
import java.util.Queue;

class TreeNodeX {
      int val;
    TreeNodeX left;
    TreeNodeX right;
    TreeNodeX() {}
    TreeNodeX(int val) { this.val = val; }
    TreeNodeX(int val, TreeNodeX left, TreeNodeX right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Q872_Leaf_Similar_Trees {

    public boolean leafSimilar(TreeNodeX root1, TreeNodeX root2) {
        Queue queue1 = new LinkedList();
        Queue queue2 = new LinkedList();
        fillQueue(root1, queue1);
        fillQueue(root2, queue2);
        return isEqualQueue(queue1, queue2);
    }

    private boolean isEqualQueue(Queue<Integer> q1, Queue<Integer> q2) {
        if(q1.size() == 0 && q2.size() == 0) return true;
        if(q1 == null || q2 == null ) return  false;
        Integer element1 = q1.poll();
        Integer element2 = q2.poll();

        if(element1 != element2) return false;
        else return isEqualQueue(q1, q2);
    }
    private void fillQueue(TreeNodeX root1, Queue queue) {
        if(isLeaf(root1)) queue.offer(root1.val);
        if(root1 == null ) return;
        fillQueue(root1.left, queue);
        fillQueue(root1.right, queue);
    }
    private boolean isLeaf(TreeNodeX node) {
        if(node == null) return false;
        return node.left == null && node.right== null;
    }
}
