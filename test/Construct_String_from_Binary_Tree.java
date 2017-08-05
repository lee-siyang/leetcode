import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lisiyang on 17/8/4.
 * https://leetcode.com/problems/construct-string-from-binary-tree/description/
 * 606. Construct String from Binary Tree
 */
public class Construct_String_from_Binary_Tree {
    public String tree2str(TreeNode t) {
//        if (t == null) return null;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(t);
//        StringBuilder result = new StringBuilder();
//        while (!queue.isEmpty()){
//            TreeNode now = queue.poll();
//            result.append(now.val);
//            if (now.left != null) {
//                queue.offer(now.left);
//                result.append('(');
//            }
//            else result.append(')');
//            if (now.right != null) {
//                queue.offer(now.right);
//                result.append('(');
//            }
//            else result.append(')');
//        }
//        return new String(result);

        if (t == null) return "";
        if (t.left == null && t.right==null) return ""+t.val;
        String result = ""+t.val +"("+tree2str(t.left)+")";
        result = t.right==null?result:result+"("+tree2str(t.right)+")";
        return result;
    }
}
