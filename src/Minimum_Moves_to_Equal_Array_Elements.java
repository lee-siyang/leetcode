import java.util.Arrays;

/**
 * Created by lisiyang on 17/6/25.
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/#/description
 * 453. Minimum Moves to Equal Array Elements
 */
public class Minimum_Moves_to_Equal_Array_Elements {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(minMoves(nums));
    }
    public static int minMoves(int[] nums) {
        if (nums.length<1) return 0;
        int min = nums[0];
        for (int i:nums) min = Math.min(min,i);
        int count = 0;
        for (int i:nums) count += (i - min);
        return count;
//        OUT OF TIME
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        if (nums.length<1) return 0;
//        int count = 0;
//        while (nums[0]!=nums[nums.length-1]){
//            for (int i =0 ;i<nums.length-1;i++)
//                nums[i]++;
//            count++;
//            Arrays.sort(nums);
//            System.out.println(Arrays.toString(nums));
//        }
//        return count;
    }
}
