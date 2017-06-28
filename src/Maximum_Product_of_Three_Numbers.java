import java.util.Arrays;

/**
 * Created by lisiyang on 17/6/28.
 * https://leetcode.com/problems/maximum-product-of-three-numbers/#/description
 * 628. Maximum Product of Three Numbers
 */
public class Maximum_Product_of_Three_Numbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,-4,-5};
        System.out.println(maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums) {

//        int[] n = new int[nums.length];
//        for (int i=0;i<nums.length;i++)
//            n[i] = Math.abs(nums[i]);
//        System.out.println(Arrays.toString(n));
        if (nums.length<3) return 0;
        Arrays.sort(nums);
        return Math.max(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3],
                nums[nums.length-1]*nums[0]*nums[1]);
//        for (int i = n.length-1;i>=n.length-3;i--){
//            max *= n[i];
//        }
//        return maxP;
    }
}
