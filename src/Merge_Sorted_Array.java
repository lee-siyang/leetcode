/**
 * Created by lisiyang on 17/7/21.
 * https://leetcode.com/problems/merge-sorted-array/#/description
 * 88. Merge Sorted Array
 */
public class Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int sort = 0;
//        int[] temp = new int[m+n];
        int k=n+m-1;
        int i=m-1,j=n-1;
        while (i>-1 && j>-1){
            nums1[k--]=nums1[i]>nums2[j]?nums1[i--]:nums2[j--];
        }
        while (j>-1){
            nums1[k--] = nums2[j--];
        }
    }
}
