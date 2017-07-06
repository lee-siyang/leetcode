/**
 * Created by lisiyang on 17/7/6.
 * https://leetcode.com/problems/maximum-subarray/#/description
 * 53. Maximum Subarray
 */
public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int maxEnd = maxSub;
        for (int i=1;i<nums.length;i++){
            maxSub = Math.max(maxSub+nums[i],nums[i]);
            maxEnd = Math.max(maxEnd,maxSub);
        }
        return maxEnd;
    }
}
