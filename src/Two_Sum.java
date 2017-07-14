import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lisiyang on 17/7/14.
 * https://leetcode.com/problems/two-sum/#/description
 * 1. Two Sum
 */
public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<nums.length;i++){
            if (map.containsKey(target - nums[i])){
//                return new int[]{map.get(i),i};
                res[1] = i;
                res[0] = map.get(target - nums[i]);
                return res;
            }
            map.put(nums[i],i);
        }
        return new int[]{0,0};
//        if (nums.length==0) return null;
//        Arrays.sort(nums);
//        int high = nums.length-1;
//        int low = 0;
//        while (low<high){
////            int mid = (low+high)/2;
//            if (nums[high]+nums[low] == target){
//                return new int[] {low,high};
//            }
//            else if (nums[high]+nums[low] > target){
//                high--;
//            }
//            else {
//                low++;
//            }
//        }
//        return null;
    }
}
