/**
 * Created by lisiyang on 17/7/1.
 * https://leetcode.com/problems/convert-a-number-to-hexadecimal/#/description
 * 405. Convert a Number to Hexadecimal
 */
public class Convert_a_Number_to_Hexadecimal {
    public static void main(String[] args){
//        int i = (int)Math.pow(2,32);
//        System.out.println(0x80000000&1);
//        System.out.println(0xffffffff);
        System.out.println(toHex(-1));
    }
    public static String toHex(int num) {
        if (num==0) return "0";

        char[] charHex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        String res = "";
        while (num!=0) {
//            int low = num & (16 - 1);
            res = charHex[(num & 15)]+res;
            num= num>>>4;
//            System.out.println(low);
        }
        return res;
    }
}
