package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q113_Path_Sum_IITest {

    @Test
    void pathSum() {
        Q113_Path_Sum_II q113_path_sum_ii = new Q113_Path_Sum_II();

        TreeNode root = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
                new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1))));

        List<List<Integer>> result = q113_path_sum_ii.pathSum(root, 22);


    }
    @Test
    void pathSum1() {
        Q113_Path_Sum_II q113_path_sum_ii = new Q113_Path_Sum_II();

        TreeNode root = new TreeNode(1, new TreeNode(2), null);

        List<List<Integer>> result = q113_path_sum_ii.pathSum(root, 1);
        assert(result.isEmpty());

    }

    @Test
    void pathSum2() {
        Q113_Path_Sum_II q113_path_sum_ii = new Q113_Path_Sum_II();

        TreeNode root = new TreeNode(-2, null,new TreeNode(-3));

        List<List<Integer>> result = q113_path_sum_ii.pathSum(root, -5);
        assert(!result.isEmpty());

    }
}