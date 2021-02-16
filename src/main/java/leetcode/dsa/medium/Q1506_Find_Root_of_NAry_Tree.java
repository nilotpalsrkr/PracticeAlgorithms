package leetcode.dsa.medium;

import java.util.*;

class NAryNode {
    public int val;
    public List<NAryNode> children;


    public NAryNode() {
        children = new ArrayList<NAryNode>();
    }

    public NAryNode(int _val) {
        val = _val;
        children = new ArrayList<NAryNode>();
    }

    public NAryNode(int _val,ArrayList<NAryNode> _children) {
        val = _val;
        children = _children;
    }
};
public class Q1506_Find_Root_of_NAry_Tree {
    public NAryNode findRoot(List<NAryNode> tree) {

        Set<NAryNode> setNodesHavingInputs = new HashSet<>();

        for(NAryNode node : tree) {
            List<NAryNode> childList = node.children;
            for(NAryNode child : childList) {
                setNodesHavingInputs.add(child);
            }
        }

        for(NAryNode node : tree) {
            if(!setNodesHavingInputs.contains(node))
                return node;
        }

        return null;
    }
}
