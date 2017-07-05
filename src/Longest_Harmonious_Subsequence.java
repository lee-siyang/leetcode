//import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lisiyang on 17/7/5.
 * https://leetcode.com/problems/longest-harmonious-subsequence/#/description
 * 594. Longest Harmonious Subsequence
 */
public class Longest_Harmonious_Subsequence {
    public int findLHS(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i:nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        int res = 0;
        for (int key: map.keySet()){
            if (map.containsKey(key+1)){
                res = Math.max(res, map.get(key)+map.get(key+1));
            }
        }
        return res;
//        int len = nums.length;
//        if (nums==null ||len==0 ||len==1)
//            return 0;
//
////        Arrays.sort(nums);
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i:nums){
//            if (map.get(i)==null){
//                map.put(i,1);
//            }
//            else {
//                Integer integer = map.get(i)+1;
//                map.put(i,integer);
//            }
//        }
//        int maxHS = 0;
//        for (int i = 0;i<len-1;i++){
//            for (int j = i+1;j<len;j++){
//                if (Math.abs(nums[i]-nums[j])==1){
//                    maxHS = Math.max(maxHS,map.get(nums[i])+map.get(nums[j]));
//                }
//            }
//        }
//        return maxHS;
    }
}
