/**
 * Created by lisiyang on 17/7/3.
 * https://leetcode.com/problems/power-of-four/#/description
 * 342. Power of Four
 */
public class Power_of_Four {
    public boolean isPowerOfFour(int num) {
        return num>0 && (num & 0x55555555) !=0 && (num & (num-1))==0;
    }
}
