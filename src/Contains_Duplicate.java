import java.util.HashSet;
import java.util.Set;

/**
 * Created by lisiyang on 17/6/29.
 * https://leetcode.com/problems/contains-duplicate/#/description
 * 217. Contains Duplicate
 */
public class Contains_Duplicate {
    public static void main(String[] args){
        int[] nums = {12,3,45,61,12,4};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int i:nums){
            if (!numSet.add(i))
                return true;
        }
        return false;
//
//        for(int i = 0; i < nums.length-1; i++) {
//            for(int j = i + 1; j < nums.length; j++) {
//                if(nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
    }
}
