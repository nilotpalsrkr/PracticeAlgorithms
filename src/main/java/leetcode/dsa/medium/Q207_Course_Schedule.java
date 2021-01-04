package leetcode.dsa.medium;

import java.util.*;

public class Q207_Course_Schedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    Map<Integer, NodeY> whiteMap = new HashMap<>();
    createGraph(prerequisites, whiteMap);
    Optional<NodeY> rootOptional = whiteMap.entrySet().stream().map(x -> x.getValue()).findFirst();
    boolean canFinish = false;
    if(rootOptional.isPresent())
        canFinish = !detectCycle(rootOptional.get(), whiteMap, new HashMap(), new HashMap(), false);
    else canFinish = true;
    return canFinish;
    }

    private void createGraph(int[][] input, Map<Integer, NodeY> whiteSet) {
        Arrays.stream(input).forEach(c -> {
                Integer start = c[1];
                Integer end = c[0];
                NodeY node0 = whiteSet.containsKey(start) ? whiteSet.get(start) : new NodeY(start);
                NodeY node1 = whiteSet.containsKey(end) ? whiteSet.get(end) : new NodeY(end);

                if (!whiteSet.containsKey(start)) {
                    node0.list = whiteSet.containsKey(start) ? whiteSet.get(start).list : new ArrayList<>();
                    node1.list = whiteSet.containsKey(end) ? whiteSet.get(end).list : new ArrayList<>();
                    whiteSet.put(start, node0);
                    whiteSet.put(end, node1);
                    whiteSet.get(start).list.add(node1);
                } else {
                    node1.list = whiteSet.containsKey(start) ? whiteSet.get(start).list : new ArrayList<>();
                    whiteSet.get(start).list.add(node1);
                }
            });
    }

    private boolean detectCycle(NodeY root, Map<Integer,NodeY> whiteMap, Map<Integer, NodeY> greyMap, Map<Integer, NodeY> blackMap, boolean isCycle) {
        Integer  key = root.num;
        if(greyMap.containsKey(key)) return true;

        if(whiteMap.containsKey(key)) {
            whiteMap.remove(key);
            greyMap.put(key,root);

            for(NodeY child : root.list) {
                isCycle = detectCycle(child, whiteMap, greyMap, blackMap, isCycle) || isCycle;
            }
            greyMap.remove(key);
            blackMap.put(key,root);
        }
        return isCycle;
    }
}

class NodeY {
    int num;
    List<NodeY> list;
    public NodeY(int num) {
        this.num = num;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NodeY node = (NodeY) o;
        return num == node.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}
