/**
 * Created by lisiyang on 17/6/17.
 * https://leetcode.com/problems/single-number/#/description
 * 136. Single Number
 */
public class Single_Number {
    public static void main(String[] args){
        int[] test = {2,2,1};
        System.out.println(singleNumber(test));
    }
    public static int singleNumber(int[] nums) {
        int res = 0;
        for(int i =0; i <nums.length;i++){
            res ^= nums[i];
//            boolean found = false;
//            for(int j = 0;!found && j<nums.length;j++){
//                if(i!=j)
//                    if(nums[i]==nums[j])
//                        found=true;
//            }
//            if (!found) return nums[i];
        }
        return res;
    }
}
