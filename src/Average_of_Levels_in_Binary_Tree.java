import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by lisiyang on 17/7/26.
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/#/description
 * 637. Average of Levels in Binary Tree
 */
public class Average_of_Levels_in_Binary_Tree {
    public List<Double> averageOfLevels(TreeNode root) {
        if(root==null) return null;
        List<Double> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            double sum = 0.0;
            int size = queue.size();
            for(int i =0 ;i<size;i++){
                TreeNode node = queue.poll();
                sum += node.val;
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            result.add(sum/size);
        }
        return result;
    }
}
