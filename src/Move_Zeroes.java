import java.util.Arrays;

/**
 * Created by lisiyang on 17/6/21.
 * https://leetcode.com/problems/move-zeroes/#/description
 * 283. Move Zeroes
 */
public class Move_Zeroes {
    public static void main(String[] args){
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int[] mNums = nums;//new int[len];
        int count=0;
        for (int i = 0;i<len;i++){
            if (mNums[i]!=0){
                nums[count] = mNums[i];
                count++;
            }
        }
        for (int i = count;i<len;i++){
            nums[i] = 0;
        }
//        nums=mNums;
    }
}
