import java.util.Arrays;

/**
 * Created by lisiyang on 17/6/11.
 * 561. Array Partition I
 * https://leetcode.com/problems/array-partition-i/#/description
 */
public class Array_Partition_I {
    public static void main(String[] args) {
        int[] in = {1,4,3,2};

        System.out.println(arrayPairSum(in));
    }
    public static int arrayPairSum(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            res+=nums[i];
        }
        return res;
    }
}
