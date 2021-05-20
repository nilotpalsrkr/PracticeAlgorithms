package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1609_Even_Odd_TreeTest {

    @Test
    void isEvenOddTree() {

        TreeNode treeNode = new TreeNode(1, new TreeNode(10, new TreeNode(3, new TreeNode(12), new TreeNode(8)), null),
                new TreeNode(4, new TreeNode(7, new TreeNode(6), null), new TreeNode(9, null, new TreeNode(2))));

        Q1609_Even_Odd_Tree q1609_even_odd_tree = new Q1609_Even_Odd_Tree();
        q1609_even_odd_tree.isEvenOddTree(treeNode);
    }
}