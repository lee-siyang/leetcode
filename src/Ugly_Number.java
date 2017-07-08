/**
 * Created by lisiyang on 17/7/8.
 * https://leetcode.com/problems/ugly-number/#/description
 * 263. Ugly Number
 */
public class Ugly_Number {
    public boolean isUgly(int num) {

        if (num == 1) return true;
        if (num == 0) return false;
//        while (num != 0){
            while (num%2 == 0) num>>=1;
            while (num%3 == 0) num/=3;
            while (num%5 == 0) num/=5;
//        }
        return num==1;
    }
}
