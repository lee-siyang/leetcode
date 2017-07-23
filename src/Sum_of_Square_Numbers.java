/**
 * Created by lisiyang on 17/7/23.
 * https://leetcode.com/problems/sum-of-square-numbers/#/description
 * 633. Sum of Square Numbers
 */
public class Sum_of_Square_Numbers {
    public boolean judgeSquareSum(int c) {
        if (c<0) return false;
        int left = 0;
        int right = (int)Math.sqrt(c);
        while (left<=right){
            int res = left*left + right*right;
            if (res==c) return true;
//            res<c?left++:right--;
            else if (res<c){
                left++;
            }
            else {
                right--;
            }
//            else return true;
        }
        return false;
    }
}
