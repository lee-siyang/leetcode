/**
 * Created by lisiyang on 17/8/3.
 * https://leetcode.com/problems/powx-n/description/
 * 50. Pow(x, n)
 */
public class Pow_xn {

    public double myPow(double x, int n) {
//        if (n==0) return 1;
//        if (n<0){
//            n = -n;
//            x = 1/x;
//        }
//        return (n % 2 == 0) ? myPow(x*x ,n/2) : myPow(x*x,n/2) * x;

        if (n==0) return 1;
        double p = myPow(x*x, Math.abs(n/2));
        if (n>0) return n%2==0?p:p*x;
        else return n%2==0?1/p:1/(p*x);
//        if(n == 0) return 1.0d;
//        double p = myPow(x*x, Math.abs(n/2)); // Safe from Integer overflow
//        if(n > 0) return n%2==0?p:x*p;
//        else return n%2==0?1/p:1/(x*p);
    }

    public static void main(String[] args){
        Pow_xn powXN = new Pow_xn();
        System.out.println(powXN.myPow(8,-2));
    }
}
