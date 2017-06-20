/**
 * Created by lisiyang on 17/6/20.
 * https://leetcode.com/problems/sum-of-two-integers/#/description
 * 371. Sum of Two Integers
 */
public class Sum_of_Two_Integers {
    public static void main(String[] args) {

        System.out.println(getSum(5,6));
    }
    public static int getSum(int a, int b) {
        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }
}
