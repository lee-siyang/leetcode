import java.util.Arrays;

/**
 * Created by lisiyang on 17/6/23.
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/#/description
 * 167. Two Sum II - Input array is sorted
 */
public class Two_Sum_II {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
//        boolean found = false;
//        int[] res = new int[2];
//        if (numbers.length<2||numbers==null){
//            return res;
//        }
        int left = 0;
        int right = numbers.length-1;

        while (numbers[left]+numbers[right]!=target){
//            if (numbers[left]+numbers[right]==target){
//                res[0]=left+1;
//                res[1]=right+1;
//                break;
//            }
            if (numbers[left]+numbers[right]<target){
                left++;
            }
            else{
                right--;
            }
        }
//        for (int i = 0; !found && i < numbers.length-1;i++){
//            for (int j=i+1;j<numbers.length;j++){
//                if (target==numbers[i]+numbers[j]){
//                    found=true;
//                    res[0]=i+1;
//                    res[1]=j+1;
//                    break;
//                }
//            }
//        }
        int[] res={left+1,right+1};
        return res;
    }
}
