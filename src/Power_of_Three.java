/**
 * Created by lisiyang on 17/7/3.
 * https://leetcode.com/problems/power-of-three/#/description
 * 326. Power of Three
 */
public class Power_of_Three {
    public boolean isPowerOfThree(int n) {
        return n>0 && (int)(Math.pow(3,19)%n)==0;
//        if (n<1) {
//            return false;
//        }
//        if (n/3!=0 && n%10!=1||n%10!=3||n%10!=9||n%10!=7){
//            return false;
//        }
//        Integer integer=n;

    }
}
