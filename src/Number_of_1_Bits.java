/**
 * Created by lisiyang on 17/7/3.
 * https://leetcode.com/problems/number-of-1-bits/#/description
 * 191. Number of 1 Bits
 */
public class Number_of_1_Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
//        下面这个也行,用不考虑符号的右移比较省时间
//        int sum=0;
//        while (n!=0){
//            sum += (n&1);
//            n=n>>>1;
//        }
//        return sum;
    }
}
