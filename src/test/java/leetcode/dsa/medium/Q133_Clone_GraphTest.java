package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Q133_Clone_GraphTest {

    @Test
    void cloneGraph() {
        NodeX nodeX1 = new NodeX(1);
        NodeX nodeX4 = new NodeX(4);
        NodeX nodeX3 = new NodeX(3);
        NodeX nodeX2 = new NodeX(2);

        nodeX1.setNeighbors(Arrays.asList(nodeX2, nodeX4));
        nodeX2.setNeighbors(Arrays.asList(nodeX1, nodeX3));
        nodeX3.setNeighbors(Arrays.asList(nodeX4, nodeX2));
        nodeX4.setNeighbors(Arrays.asList(nodeX1, nodeX3));

        Q133_Clone_Graph q133_clone_graph = new Q133_Clone_Graph();
        NodeX clonnedNodeX = q133_clone_graph.cloneGraph(nodeX1);
        assertNotEquals(nodeX1, clonnedNodeX);

    }

    @Test
    void cloneGraph2() {
        NodeX nodeX1 = new NodeX(1);
        NodeX nodeX4 = new NodeX(4);

        NodeX nodeX2 = new NodeX(2);

        nodeX1.setNeighbors(Arrays.asList(nodeX2, nodeX4));
        nodeX2.setNeighbors(Arrays.asList(nodeX1));
        nodeX4.setNeighbors(Arrays.asList(nodeX1));

        Q133_Clone_Graph q133_clone_graph = new Q133_Clone_Graph();
        NodeX clonnedNodeX = q133_clone_graph.cloneGraph(nodeX1);
        assertNotEquals(nodeX1, clonnedNodeX);

    }

    @Test
    void cloneGraph1() {
        NodeX nodeX1 = new NodeX(1);
        NodeX nodeX2 = new NodeX(2);

        nodeX1.setNeighbors(Arrays.asList(nodeX2));
        nodeX2.setNeighbors(Arrays.asList(nodeX1));


        Q133_Clone_Graph q133_clone_graph = new Q133_Clone_Graph();
        NodeX clonnedNodeX = q133_clone_graph.cloneGraph(nodeX1);
        assertNotEquals(nodeX1, clonnedNodeX);

    }
    @Test
    void cloneGraph3() {
        NodeX nodeX1 = new NodeX(1);
        nodeX1.setNeighbors(Arrays.asList());
        Q133_Clone_Graph q133_clone_graph = new Q133_Clone_Graph();
        NodeX clonnedNodeX = q133_clone_graph.cloneGraph(nodeX1);
        assertNotEquals(nodeX1, clonnedNodeX);

    }

    @Test
    void cloneGraph4() {
        NodeX nodeX1 = null;
        Q133_Clone_Graph q133_clone_graph = new Q133_Clone_Graph();
        NodeX clonnedNodeX = q133_clone_graph.cloneGraph(nodeX1);
        assertEquals(nodeX1, clonnedNodeX);

    }
}