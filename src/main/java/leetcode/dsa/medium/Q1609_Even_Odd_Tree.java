package leetcode.dsa.medium;

import java.util.LinkedList;
import java.util.Queue;

public class Q1609_Even_Odd_Tree {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode leftNode = node.left;
            TreeNode rightNode = node.right;
            if(leftNode!=null) queue.add(leftNode);
            if(rightNode!=null) queue.add(rightNode);
            System.out.println(node);
        }
        return false;
    }
}
