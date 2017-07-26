import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lisiyang on 17/7/26.
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/#/description
 * 104. Maximum Depth of Binary Tree
 */
public class Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int result = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i =0; i < size; i++){
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            result++;
        }
        return result;
    }
}
