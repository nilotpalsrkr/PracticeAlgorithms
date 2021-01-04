package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1485_Clone_Binary_Tree_With_Random_PointerTest {

    @Test
    void copyRandomBinaryTree() {
        Node node0 = new Node(1);
        Node node1 = null;
        Node node2 = new Node(4);
        Node node3 = new Node(7);

        node0.left = node1;
        node0.right = node2;
        node0.random = null;

        node2.left = node3;
        node2.right = null;
        node2.random = node3;

        node3.left = null;
        node3.right = null;
        node3.random = node0;

        Q1485_Clone_Binary_Tree_With_Random_Pointer q1485_clone_binary_tree_with_random_pointer = new Q1485_Clone_Binary_Tree_With_Random_Pointer();
        NodeCopy nodeCopy = q1485_clone_binary_tree_with_random_pointer.copyRandomBinaryTree(node0);


    }
}