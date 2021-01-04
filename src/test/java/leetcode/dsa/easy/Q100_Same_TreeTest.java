package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q100_Same_TreeTest {

    @Test
    void isSameTree() {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(3), new TreeNode(2));
        Q100_Same_Tree q100_same_tree = new Q100_Same_Tree();
        boolean isSame = q100_same_tree.isSameTree(p, q);
        assertEquals(true, isSame);

    }
}