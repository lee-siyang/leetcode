/**
 * Created by lisiyang on 17/6/8.
 * 476. Number Complement
 * https://leetcode.com/problems/number-complement/#/description
 */
public class Number_Complement {
    public static void main(String[] args) {
        int n = 3;
        int res = findComplement(n);
        System.out.println(res);
    }
    public static int findComplement(int num) {
        if(num==0) return 0;
        if(num<0) return ~num;
        int mask=1;
        while (mask < num){
            mask<<=1;
            mask|=1;
        } return mask^num;
    }
}
