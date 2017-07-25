import java.lang.reflect.Array;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by lisiyang on 17/7/25.
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/#/description
 * 581. Shortest Unsorted Continuous Subarray
 */
public class Shortest_Unsorted_Continuous_Subarray {
    public int findUnsortedSubarray(int[] A) {
//        Set<Integer> sortedNum = new TreeSet<>();
//        for (Integer i : nums){
//            sortedNum.add(i);
//        }
//        int count = 0;
//        boolean flag = false;
//        int left = 0, right=0;
//        for (Integer i : sortedNum){
//            if (!flag && nums[count] != i){
//                left=count;
//                flag=true;
//            }
//            if (nums[count++] != i){
//                right = count;
//            }
//        }
//
//        return right-left;
        int n = A.length, beg = -1, end = -2, min = A[n-1], max = A[0];
        for (int i=1;i<n;i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[n-1-i]);
            if (A[i] < max) end = i;
            if (A[n-1-i] > min) beg = n-1-i;
        }
        return end - beg + 1;
    }
}
