/**
 * Created by lisiyang on 17/7/11.
 * https://leetcode.com/problems/palindrome-number/#/description
 * 9. Palindrome Number
 */
public class Palindrome_Number {
    public static boolean isPalindrome(int x) {
//        if (x>0 && x<10) return true;
        int orign = x;
        int reverse = 0;
        while (x>0){
            reverse = reverse*10 + x%10;
            x = x/10;
        }
        return reverse == orign;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(12321));
    }
}
