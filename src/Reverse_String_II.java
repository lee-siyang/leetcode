/**
 * Created by lisiyang on 17/6/12.
 * https://leetcode.com/problems/reverse-string-ii/#/description
 * 541. Reverse String II
 */
public class Reverse_String_II {
    public static void main(String[] args) {
        String s ="abcdefg";
        int k = 2;
        //String res = reverseString(s);
        System.out.println(reverseStr(s, k));
    }
    public static String reverseStr(String s, int k) {
        char[] sChar = s.toCharArray();
        for (int left = 0; left < sChar.length; left += 2 * k) {
            for (int i = left, j = Math.min(left + k - 1, sChar.length - 1);
                 i < j; i++, j--) {
                char temp = sChar[i];
                sChar[i] = sChar[j];
                sChar[j] = temp;
            }
        }
        return new String(sChar);
//        int len = s.length();
//        String ans = "";
////        char[]
//        int leftNumber = len;
//        while(leftNumber+k>0){
//            if(leftNumber<k) k=leftNumber;
//            int startchar = len-leftNumber+k;
//            for(int i= 1;i<=k;i++){
//
//                ans += s.substring(startchar-i,startchar-i+1);
//            }
//            ans += s.substring(len-leftNumber+k,len-leftNumber+2*k+1);
//            leftNumber -= k*2;
//        }
//
////        for(int i=k;i<len;i++){
////            ans +=
////        }
//        return ans+s.substring(len-leftNumber);
    }
}
