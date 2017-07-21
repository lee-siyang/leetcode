import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by lisiyang on 17/7/21.
 * https://leetcode.com/problems/contains-duplicate-ii/#/description
 * 219. Contains Duplicate II
 */
public class Contains_Duplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> findSet = new HashSet<>();
        for (int i = 0; i<nums.length;i++){
            if (i>k) {
                findSet.remove(nums[i-k-1]);
            }
            if (!findSet.add(nums[i])){
                return true;
            }
            return false;
        }
//        Map<Integer, Integer> findIJ = new HashMap<>();
//        for (int i = 0;i<nums.length;i++){
//            findIJ.put(i,nums[i]);
//        }
//        for (Integer keyI:findIJ.keySet()){
//            for (Integer keyJ:findIJ.keySet()){
//                if (!keyI.equals(keyJ) && Math.abs(keyI-keyJ)<=k
//                        && findIJ.get(keyI).equals(findIJ.get(keyJ))){
//                    return true;
//                }
//            }
//        }
//        return false;
    }
}
