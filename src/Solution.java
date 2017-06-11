/**
 * 485. Max Consecutive Ones
 * https://leetcode.com/problems/max-consecutive-ones/#/description
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args){
        int[] arr = new int[2840];
        Arrays.fill(arr,1);

        int[] a = {1,1,1,0,1,1,1,1,0,0,0,1};
        int res = findMaxConsecutiveOnes(a);
        System.out.println(res);

    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        int max = 0;
        int  maxHere= 0;
        for (int i = 0; i < len; i++) {
            if (nums[i]==1) {
                maxHere++;
                max=Math.max(max, maxHere);
            } else {
                maxHere=0;
            }
        }
        //lsy
        return max;
    }
}