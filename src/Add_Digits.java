/**
 * Created by lisiyang on 17/6/21.
 * https://leetcode.com/problems/add-digits/#/description
 * 258. Add Digits
 */
public class Add_Digits {
    public static void main(String[] args){
        System.out.println(addDigits(38));
    }
    public static int addDigits(int num) {
        if (num==0) return 0;
        int res = num%9;
        return res==0?9:res;
    }
}
