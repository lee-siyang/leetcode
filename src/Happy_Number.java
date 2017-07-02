import java.util.HashSet;
import java.util.Set;

/**
 * Created by lisiyang on 17/7/2.
 * https://leetcode.com/problems/happy-number/#/description
 * 202. Happy Number
 */
public class Happy_Number {
    public static void main(String[] args){
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        if (n==1) return true;
        Set<Integer> notHappy = new HashSet<>();
        while (notHappy.add(n)) {
            int newN = 0;

            while (n != 0) {
                newN += (int) Math.pow(n % 10, 2);
                n /= 10;
            }
            if (newN==1)
                return true;
            n=newN;
        }
        return false;
    }
}
