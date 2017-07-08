import java.util.Arrays;

/**
 * Created by lisiyang on 17/7/8.
 * https://leetcode.com/problems/remove-element/#/description
 * 27. Remove Element
 */
public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        if (nums.length==0 || nums==null) return 0;
        int len = nums.length;
        for (int i = 0;i<len;i++){
            if (nums[i] == val){
                nums[i--]=nums[len - 1];
                len--;
            }
        }
        return len;

//        Arrays.sort(nums);
//        int i = 0;
//        while (i<nums.length && nums[i++] != val);
//        int result = 0;
//        while (i<nums.length && nums[i++]==val)
//            result++;
//        return result;
    }
}
