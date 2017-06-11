/**
 * Created by lisiyang on 17/6/9.
 * 344. Reverse String
 * https://leetcode.com/problems/reverse-string/#/description
 */
public class Reverse_String {
    public static void main(String[] args) {
        String s ="hello";
        //String res = reverseString(s);
        System.out.println(reverseString(s));
    }
    public static String reverseString(String s) {
        int len=s.length();
        char[] res = new char[len];
        for(int i=0;i<=len-1;i++){
            res[i]= s.charAt(len-1-i);
        }
        return new String(res);
    }
}
