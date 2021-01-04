package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q872_Leaf_Similar_TreesTest {

    @Test
    void leafSimilar1() {
        TreeNodeX root1 = new TreeNodeX(1, null, new TreeNodeX(2));
        TreeNodeX root2 = new TreeNodeX(1, new TreeNodeX(2), null);
        Q872_Leaf_Similar_Trees q872_leaf_similar_trees = new Q872_Leaf_Similar_Trees();
        boolean result = q872_leaf_similar_trees.leafSimilar(root1, root2);
        assertEquals(true, result);
    }
    @Test
    void leafSimilar2() {
        TreeNodeX root1 = new TreeNodeX(1, new TreeNodeX(2), new TreeNodeX(3));
        TreeNodeX root2 = new TreeNodeX(1, new TreeNodeX(4, new TreeNodeX(2), null), new TreeNodeX(5, new TreeNodeX(3), null));
        Q872_Leaf_Similar_Trees q872_leaf_similar_trees = new Q872_Leaf_Similar_Trees();
        boolean result = q872_leaf_similar_trees.leafSimilar(root1, root2);
        assertEquals(true, result);
    }
    @Test
    void leafSimilar3() {
        TreeNodeX root1 = new TreeNodeX(1, new TreeNodeX(2), new TreeNodeX(3, new TreeNodeX(4), null));
        TreeNodeX root2 = new TreeNodeX(1, new TreeNodeX(4, new TreeNodeX(2), null), new TreeNodeX(5, new TreeNodeX(3), null));
        Q872_Leaf_Similar_Trees q872_leaf_similar_trees = new Q872_Leaf_Similar_Trees();
        boolean result = q872_leaf_similar_trees.leafSimilar(root1, root2);
        assertEquals(false, result);
    }
}