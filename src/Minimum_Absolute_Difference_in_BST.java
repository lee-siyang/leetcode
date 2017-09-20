/**
 * Created by lisiyang on 17/8/9.
 */
public class Minimum_Absolute_Difference_in_BST {
     int min = Integer.MAX_VALUE;
     TreeNode prev;

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

//    public static void main(String[] args){
//        Minimum_Absolute_Difference_in_BST minnimum = new Minimum_Absolute_Difference_in_BST();
//        TreeNode[] trees = new TreeNode[4];
//
//        for (TreeNode t : trees){
//            t = new TreeNode((int)(Math.random()*10));
//            System.out.println(t.val);
//        }
//
//        trees[0].left = trees[1];trees[0].right = trees[2];
//        trees[1].left = trees[3];trees[1].right = null;
//        trees[2].left = null;trees[2].right = null;
//        trees[3].left = null;trees[3].right = null;
//
//
//        int minn = minnimum.getMinimumDifference(trees[0]);
//        System.out.println(minn);
//    }
}
