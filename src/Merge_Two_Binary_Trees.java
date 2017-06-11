/**
 * Created by lisiyang on 17/6/11.
 *
 * 617. Merge Two Binary Trees
 * https://leetcode.com/problems/merge-two-binary-trees/#/description
 *
 * 这个，额虽然按照人家的答案写了。。也懂了意思，无奈我不会写主函数测试。。。
 * 还有那个treeNode应该是要写在另一个Class里的，因为我也是不能测试，就暂时没放出去
 */
public class Merge_Two_Binary_Trees {
    public static void main(String[] args) {

    }
    public static class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1==null && t2==null) return null;
        int value;
        value = (t1==null? 0: t1.val) + (t2==null? 0: t2.val);
        TreeNode newNode = new TreeNode(value);
        newNode.left = mergeTrees(t1==null? null: t1.left,t2==null? null: t2.left);
        newNode.right = mergeTrees(t1==null? null: t1.right,t2==null? null: t2.right);
        return newNode;
    }
}
