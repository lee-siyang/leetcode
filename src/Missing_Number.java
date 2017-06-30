/**
 * Created by lisiyang on 17/6/30.
 * https://leetcode.com/problems/missing-number/#/description
 * 268. Missing Number
 */
public class Missing_Number {
    public static void main(String[] args){
        int[] nums = {0,1,2,4};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {

        int len = nums.length;
        int res=len*(len+1)/2;
        for (int i:nums){
            res-=i;
        }
        return res;
//        for (int i =0;i<len;i++){
//            if (nums[i] != nums[0]+i)
//                return nums[0]+i;
//        }
//        return -1;
    }
}
