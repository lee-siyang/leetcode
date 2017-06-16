import java.util.Arrays;

/**
 * Created by lisiyang on 17/6/16.
 * https://leetcode.com/problems/next-greater-element-i/#/description
 * 496. Next Greater Element I
 */
public class Next_Greater_Element_I {
    public static void main(String[] args) {
        int[] num1 = {2,4};
        int[] num2 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(num1,num2)));
    }
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        int len1 = findNums.length;
        int len2 = nums.length;
        int res[] = new int[len1];
        for (int i = 0;i<len1;i++){
            boolean found = false;
            boolean getPlace = false;

            for (int j = 0;!found && j<len2;j++){

                if(findNums[i] == nums[j]){
                    getPlace = true;

                }
                if(getPlace && findNums[i] < nums[j]){
                    found = true;
                    res[i] = nums[j];
                }

            }
            if(!found) res[i]=-1;
        }
        return res;
    }
}
