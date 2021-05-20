package leetcode.dsa.medium;

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

     public TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }

     @Override
     public String toString() {
         return "TreeNode{" +
                 "val=" + val +
                 ", left=" + left +
                 ", right=" + right +
                 '}';
     }
 }
public class Q1379_Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null) return null;
        if(original == target) return cloned;

        TreeNode node = getTargetCopy(original.left, cloned.left, target);
        if(node == null)
        node = getTargetCopy(original.right, cloned.right, target);

        return node;
    }
}
