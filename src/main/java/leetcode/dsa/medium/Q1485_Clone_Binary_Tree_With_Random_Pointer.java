package leetcode.dsa.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Node {
    int val;
    Node left;
    Node right;
    Node random;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node left, Node right, Node random) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.random = random;
    }
}
class NodeCopy {
    int val;
    NodeCopy left;
    NodeCopy right;
    NodeCopy random;
    NodeCopy() {}
    NodeCopy(int val) { this.val = val; }
    NodeCopy(int val, NodeCopy left, NodeCopy right, NodeCopy random) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.random = random;
    }
}
public class Q1485_Clone_Binary_Tree_With_Random_Pointer {


        public NodeCopy copyRandomBinaryTree(Node root) {
            Map<Node, NodeCopy> map = new HashMap<>();
          return copy(root, map);
        }

        private NodeCopy copy(Node root, Map<Node, NodeCopy> map) {

            if(root == null) {
                return null;
            }
            if(!map.containsKey(root)) {
                NodeCopy nodeCopy = new NodeCopy(root.val);
                map.put(root, nodeCopy);
                nodeCopy.left = copy(root.left,map);
                nodeCopy.right = copy(root.right, map);
                nodeCopy.random = copy(root.random, map);
                return nodeCopy;
            }
            else return map.get(root);
        }
}
