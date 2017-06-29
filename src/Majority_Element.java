import java.util.Arrays;

/**
 * Created by lisiyang on 17/6/29.
 * https://leetcode.com/problems/majority-element/#/description
 * 169. Majority Element
 */
public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4,1,1,1};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if (len==1 || len==2) return nums[0];
        if (nums[len/2]==nums[len/2+1])
            return nums[len/2];
        else return nums[len/2-1];
    }
}
