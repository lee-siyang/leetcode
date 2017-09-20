/**
 * Created by lisiyang on 17/9/10.
 */
import java.util.*;
public class DidiTest1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int i=0;
        while (count!=n){
            if (IsUgly(++i)){
                count++;
            }
        }
        System.out.println(i);
    }
    private static boolean IsUgly(int num) {

        if (num == 1) return true;
        if (num == 0) return false;

        while (num%2 == 0) num>>=1;
        while (num%3 == 0) num/=3;
        while (num%5 == 0) num/=5;
        return num==1;
    }
}
