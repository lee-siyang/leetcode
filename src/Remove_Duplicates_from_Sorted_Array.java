/**
 * Created by lisiyang on 17/7/11.
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/#/description
 * 26. Remove Duplicates from Sorted Array
 */
public class Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        if (nums.length<2){
            return nums.length;
        }
        int res = 0;
        for (int i : nums){
            if (i!=nums[res]){
                nums[++res] = i;
            }
        }
        return ++res;
    }
}
