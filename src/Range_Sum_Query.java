import java.util.ArrayList;
import java.util.List;

/**
 * Created by lisiyang on 17/7/30.
 * https://leetcode.com/problems/range-sum-query-immutable/description/
 * 303. Range Sum Query - Immutable
 */
public class Range_Sum_Query {
    int[] nums;
//    List<Integer> list = new ArrayList<>();
    public Range_Sum_Query(int[] nums) {
//        int temp = 0;
//        int j = 0
//        for(Integer i : nums){
//            temp += i;
//            list.add(temp);
//            this.nums[i] = temp;
//        }
        for(int i = 1;i<nums.length;i++){
            nums[i] += nums[i-1];
        }
        this.nums = nums;
    }
    public int sumRange(int i, int j) {
        if (i==0) return nums[j];
        return nums[j]-nums[i-1];

//        return list.get(j)-list.get(i);
    }
    public static void main(String[] args){
        int[] nums = {1,3,4,5,2,1};
        Range_Sum_Query query = new Range_Sum_Query(nums);
        System.out.println(query.sumRange(1,3));
    }
}
