//import java.util.LinkedList;
//import java.util.Queue;
import java.util.*;

/**
 * Created by lisiyang on 17/8/9.
 * https://leetcode.com/problems/sum-of-left-leaves/description/
 * 404. Sum of Left Leaves
 */
public class Sum_of_Left_Leaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if (temp.left != null) {
                queue.offer(temp.left);
                if (temp.left.left == null && temp.left.right == null){
                    sum += temp.left.val;
                }
            }
            if (temp.right != null) queue.offer(temp.right);
        }
        return sum;
    }
}
