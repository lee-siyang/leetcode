import java.util.Scanner;

/**
 * Created by lisiyang on 17/8/25.
 * 最大子串
 */
public class MaximumSub {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0;i<n;i++){
            numbers[i] = in.nextInt();
        }
        System.out.println(maxSubArray(numbers));


    }
    private static int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int maxEnd = maxSub;
        for (int i=1;i<nums.length;i++){
            maxSub = Math.max(maxSub+nums[i],nums[i]);
            maxEnd = Math.max(maxEnd,maxSub);
        }
        return maxEnd;
    }
}
