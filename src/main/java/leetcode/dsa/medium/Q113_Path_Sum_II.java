package leetcode.dsa.medium;

import java.util.ArrayList;
import java.util.List;

public class Q113_Path_Sum_II {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        pathSumEqualsTarget(root, new ArrayList<>(),0, sum, result);
        return  result;
    }

    private void pathSumEqualsTarget(TreeNode root, List<Integer> list,Integer sumAsYet,  int sum, List<List<Integer>> listPath) {
        if(root == null ) return;

        if(sumAsYet + root.val > sum) return;
        sumAsYet = sumAsYet + root.val;
        list.add(root.val);
        if(sumAsYet == sum && isLeaf(root)) {
            if(list == null) list = new ArrayList<>();
            listPath.add(new ArrayList<>(list));
            list.remove((Integer)root.val);
        }
        else {
            pathSumEqualsTarget(root.left, list, sumAsYet, sum, listPath);
            pathSumEqualsTarget(root.right, list, sumAsYet, sum, listPath);
        }
        if(list.contains(root.val)){
            list.remove((Integer) root.val);
        }
    }

    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right==null;
    }
}
