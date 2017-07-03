/**
 * Created by lisiyang on 17/7/3.
 * https://leetcode.com/problems/number-of-1-bits/#/description
 * 191. Number of 1 Bits
 */
public class Number_of_1_Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if ((n&0x80000000)!=0){
            Integer num=n;
            return num.bitCount(n);
        }
        else {
            Integer num = n;
            return num.bitCount(num);
        }
    }
}
