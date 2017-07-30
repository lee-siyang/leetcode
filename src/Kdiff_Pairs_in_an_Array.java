import java.util.*;

/**
 * Created by lisiyang on 17/7/29.
 * https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
 * 532. K-diff Pairs in an Array
 */
public class Kdiff_Pairs_in_an_Array {
    public int findPairs(int[] nums, int k) {
        if (nums==null || nums.length==0 || k<0) return 0;
        Map<Integer,Integer> numsMap = new HashMap<>();
        for (Integer i : nums){
            numsMap.put(i,numsMap.getOrDefault(i,0)+1);
        }
        int result = 0;
        for (Map.Entry<Integer,Integer> entry : numsMap.entrySet()){
            if (k==0){
                if (entry.getValue()>=2) result++;
            }
            else if (numsMap.containsKey(entry.getKey()+k)) result++;
        }
        return result;
//        Arrays.sort(nums);
//        if (nums.length<2 || k>nums[nums.length-1]-nums[0]) return 0;
//        int res = 0;
//        Set<Integer> numsSet = new HashSet<>();
//        for (int i : nums){
//            if (!numsSet.add(i) && k==0){
//                res++;
//            }
//            else {
//                for (Integer find:numsSet){
//                    if (Math.abs(find-i)>k){
//                        numsSet.remove(find);
//                    }
//                    if (Math.abs(find-i)==k){
//                        res++;
//                    }
//                }
//            }
//
//        }
//        return res;
    }
}
