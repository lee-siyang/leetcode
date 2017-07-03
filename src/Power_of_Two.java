/**
 * Created by lisiyang on 17/7/3.
 * https://leetcode.com/problems/power-of-two/#/description
 * 231. Power of Two
 */
public class Power_of_Two {
    public boolean isPowerOfTwo(int n) {
        if (n<=0) return false;
        Integer integer = n;
        return integer.bitCount(n)==1;
    }
}
