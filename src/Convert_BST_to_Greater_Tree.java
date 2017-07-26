/**
 * Created by lisiyang on 17/7/27.
 * https://leetcode.com/problems/convert-bst-to-greater-tree/#/description
 * 538. Convert BST to Greater Tree
 */
public class Convert_BST_to_Greater_Tree {
    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;
        DFS(root,0);
        return root;
    }
    public int DFS(TreeNode root, int preSum) {
        if (root != null){
            preSum = DFS(root.right, preSum);
        }
        root.val += preSum;
        return root.left == null ? root.val: DFS(root.left, root.val);
    }
}
