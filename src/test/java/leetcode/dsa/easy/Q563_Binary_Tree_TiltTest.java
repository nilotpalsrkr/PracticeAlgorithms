package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q563_Binary_Tree_TiltTest {

    @Test
    void findTilt() {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Q563_Binary_Tree_Tilt q563_binary_tree_tilt = new Q563_Binary_Tree_Tilt();

        assertEquals(1,q563_binary_tree_tilt.findTilt(treeNode));
    }
    @Test
    void findTilt2() {
        TreeNode treeNode = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(5)), new TreeNode(9, null,new TreeNode(7)));
        Q563_Binary_Tree_Tilt q563_binary_tree_tilt = new Q563_Binary_Tree_Tilt();

        assertEquals(6,q563_binary_tree_tilt.findTilt(treeNode));
    }
}