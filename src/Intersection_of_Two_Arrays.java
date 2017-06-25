import java.util.Arrays;

/**
 * Created by lisiyang on 17/6/25.
 * https://leetcode.com/problems/intersection-of-two-arrays/#/description
 * 349. Intersection of Two Arrays
 */
public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {2, 2};
        System.out.println(Arrays.toString(intersection(num1, num2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int[] res = new int[Math.min(nums1.length,nums2.length)];
//        res[0]= Integer.MAX_VALUE;
        for (int count1 = 0, count2 = 0;count1<nums1.length && count2<nums2.length;) {
            while (count1 < nums1.length && nums1[count1] < nums2[count2]) {
                count1++;
            }
            while (count1<nums1.length && count2 < nums2.length && nums2[count2] < nums1[count1]) {
                count2++;
            }
            if (count1 < nums1.length && count2 < nums2.length &&
                    nums1[count1] == nums2[count2] ) {
                res[i++] = nums1[count1];
                while (count1 < nums1.length && nums1[count1] == res[i-1])
                    count1++;
                while (count2 < nums2.length && nums2[count2] == res[i-1])
                    count2++;
            }
        }
        int[] finalRes = new int[i];
        for (;i>0;i--){
            finalRes[i-1] = res[i-1];
        }
        return finalRes;
    }
}
