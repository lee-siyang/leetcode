import java.util.ArrayList;
import java.util.List;

/**
 * Created by lisiyang on 17/6/20.
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/#/description
 * 448. Find All Numbers Disappeared in an Array
 */
public class Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args) {
        int[] test = {4,3,2,7,8,2,3,1};
//        findDisappearedNumbers(test).toString()
        System.out.println(findDisappearedNumbers(test).toString());
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> num= new ArrayList<Integer>();
        for (int i = 0;i<nums.length;i++){
            int var = Math.abs(nums[i])-1;
            if (nums[var]>0){
                nums[var]=-nums[var];
            }

        }
        for (int i = 0;i<nums.length;i++){
            if (nums[i]>0){
                num.add(i+1);
            }
        }
        return num;
    }
}
