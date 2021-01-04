package leetcode.dsa.medium;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class NodeX {
    public int val;
    public List<NodeX> neighbors;

    public NodeX() {
        val = 0;
        neighbors = new ArrayList<NodeX>();

    }
    public NodeX(int _val) {
        val = _val;
        neighbors = new ArrayList<NodeX>();
    }
    public NodeX(int _val, List<NodeX> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public List<NodeX> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<NodeX> neighbors) {
        this.neighbors = neighbors;
    }


}



public class Q133_Clone_Graph {
    Map<Integer, NodeX> map = new HashMap<>();
    public NodeX cloneGraph(NodeX nodeX) {
        if(nodeX !=null) {
            ArrayList<NodeX> neighbourCloned = new ArrayList();
            NodeX clonedNodeX = new NodeX(nodeX.val, neighbourCloned);
            map.put(nodeX.val, clonedNodeX);
            for (NodeX neighbourNodes : nodeX.neighbors) {
                NodeX clonedNeighbourNodeX = null;
                if (!map.containsKey(neighbourNodes.val)) {
                    map.put(neighbourNodes.val, clonedNeighbourNodeX);
                    clonedNeighbourNodeX = cloneGraph(neighbourNodes);

                } else {
                    clonedNeighbourNodeX = map.get(neighbourNodes.val);
                }
                neighbourCloned.add(clonedNeighbourNodeX);
            }

            return clonedNodeX;
        }
        return null;
    }
}
