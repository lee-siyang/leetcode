/**
 * Created by lisiyang on 17/7/10.
 * https://leetcode.com/problems/valid-perfect-square/#/description
 * 367. Valid Perfect Square
 */
public class Valid_Perfect_Square {
    public boolean isPerfectSquare(int num) {
        int i=1;
        while (num>0){
            num-=i;
            i+=2;
        }
        return num==0;
//
//        if (num<1) return false;
//        int i=1;
//        while (i*i<num) i++;
//        if (i*i==num){
//            return true;
//        }
//        return false;
    }
}
