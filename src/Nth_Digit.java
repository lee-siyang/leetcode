/**
 * Created by lisiyang on 17/7/23.
 * https://leetcode.com/problems/nth-digit/#/description
 * 400. Nth Digit
 */
public class Nth_Digit {
    public int findNthDigit(int n) {
        int digit = 1;  //digit is the length of the number
        long counts = 9;  //every length of digit has 9*10^n numbers
        while (n > digit*counts){
            n -= digit*counts;
            digit++;
            counts *= 10;
        }
        int baseNumber = (int)Math.pow(10,digit-1);
        int exactNumber = (n-1)/digit + baseNumber;
        int mod = (n-1)%digit;
        return String.valueOf(exactNumber).charAt(mod)-'0';
    }
}
