/**
 * Created by lisiyang on 17/7/9.
 * https://leetcode.com/problems/house-robber/#/description
 * 198. House Robber
 */
public class House_Robber {
    public int rob(int[] nums) {
        int include = 0;
        int exclude = 0;
        for (int i :nums){
            int temp = include;
            include = i + exclude;
            exclude = Math.max(temp,exclude);
        }
        return Math.max(include,exclude);
    }
}
