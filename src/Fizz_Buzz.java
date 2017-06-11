import java.util.List;
import java.util.ArrayList;
/**
 * Created by lisiyang on 17/6/8.
 * 412. Fizz Buzz
 * https://leetcode.com/problems/fizz-buzz/#/description
 */
public class Fizz_Buzz {
    public static void main(String[] args) {
        int n = 15;
        List<String> res = fizzBuzz(n);
        System.out.println(res);

    }

    public  List<String> fizzBuzz(int n) {
        List<String> res =new ArrayList<String>(n);
        for (int i=1;i<=n;i++){
            if(i%3==0 && i%5!=0) {res.add("Fizz");continue;}
            if(i%5==0 && i%3!=0) {res.add("Buzz");continue;}
            if(i%15==0) {res.add("FizzBuzz");continue;}
            res.add(String.valueOf(i));
        }
        return res;
    }
}
