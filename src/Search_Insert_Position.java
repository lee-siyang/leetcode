/**
 * Created by lisiyang on 17/7/6.
 * https://leetcode.com/problems/search-insert-position/#/description
 * 35. Search Insert Position
 */
public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        if (nums==null || nums.length==0)
            return 0;
        int low = 0;
        int high = nums.length-1;
        while (low<=high){
            if (target<nums[(low+high)/2]){
                high = (low+high)/2-1;
            }
            else if (target>nums[(low+high)/2]){
                low = (low+high)/2+1;
            }
            else {
                return (low+high)/2;
            }
        }
        return low;
//        for (int i = 0;i<nums.length;i++){
//            if (nums[i]<target && nums[i+1]>=target)
//                return i;
//            else return nums.length;
//        }

    }
}
