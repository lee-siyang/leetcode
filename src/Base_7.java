/**
 * Created by lisiyang on 17/6/30.
 * https://leetcode.com/problems/base-7/#/description
 * 504. Base 7
 */
public class Base_7 {
    public static void main(String[] args){
        System.out.println(convertToBase7(101));
//        String t = "card";

    }
    public static String convertToBase7(int num) {
        boolean minus = false;
        if (num<0){
            num = Math.abs(num);
            minus = true;
        }
        int res = 0;
        for (int i = 0;num>0;i++){
            res+=(int)(num%7*Math.pow(10,i));
            num/=7;
        }
        String s = ""+res;
//        char[] resC = new char[s.length()];
//        for (int i = s.length()-1;i>=0;i--){
//            resC[s.length()-i-1]=s.charAt(i);
//        }
        return minus? "-" + s:s;
    }
}
