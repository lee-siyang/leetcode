import java.util.*;

/**
 * Created by lisiyang on 17/8/9.
 * https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
 * 653. Two Sum IV - Input is a BST
 */
public class Two_Sum_IV {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return Dfs(root, set, k);
    }

    private boolean Dfs(TreeNode root, Set<Integer> set, int k){
        if (root == null) return false;
        if (set.contains(k-root.val)) return true;
        set.add(root.val);
        return Dfs(root.left, set, k) || Dfs(root.right, set, k);
    }
}
