/**
 * Created by lisiyang on 17/8/9.
 */
public class Minimum_Absolute_Difference_in_BST {
    private int min = Integer.MAX_VALUE;
    private TreeNode prev;

    public int getMinimumDifference(TreeNode root) {
        Dfs(root);
        return min;
    }

    private void Dfs(TreeNode root){
        if (root == null) return;
        Dfs(root.left);
        if (prev != null){
            min = Math.min(min, Math.abs(root.val - prev.val));
        }
        prev = root;
        Dfs(root.right);
    }
}
