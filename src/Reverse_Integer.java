/**
 * Created by lisiyang on 17/8/3.
 * https://leetcode.com/problems/reverse-integer/description/
 * 7. Reverse Integer
 */
public class Reverse_Integer {
    public int reverseInt(int x) {
        long ans = 0;
        boolean negative = false;
        if (x<0) {
            negative = true;
            x = -x;
        }
        while (x>0){
            ans = ans*10 + x%10;
            x /= 10;
        }
        if (negative) ans = -ans;
        return ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE?0:(int)ans;
    }
    public static void main(String[] args){
        int num = -1000000005;
        Reverse_Integer rInt = new Reverse_Integer();
        System.out.println(rInt.reverseInt(num));
    }
}
