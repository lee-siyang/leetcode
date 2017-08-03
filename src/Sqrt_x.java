/**
 * Created by lisiyang on 17/8/2.
 * https://leetcode.com/problems/sqrtx/description/
 * 69. Sqrt(x)
 */
public class Sqrt_x {
    public int mySqrt(int x) {
        long r = x;
        while (r*r>x){
            r = (r + x/r)/2;
        }
        return (int)r;
    }
    public static void main(String[] args){
        Sqrt_x sqrtX = new Sqrt_x();
        int x= 100;
        System.out.println(sqrtX.mySqrt(x));
    }
}
