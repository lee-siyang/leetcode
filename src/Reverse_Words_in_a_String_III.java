/**
 * Created by lisiyang on 17/6/11.
 */
public class Reverse_Words_in_a_String_III {
    public static void main(String[] args) {
        String s ="Let's take LeetCode contest";
        //String res = reverseString(s);
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        int len=s.length();
        char[] res = new char[len];
        for(int i=0;i<=len-1;i++){
            res[i]= s.charAt(len-1-i);
        }
        return new String(res);
//        String words=s;
//        for (int i=0;i<len/2;i++)
//            words=s.replace(s.charAt(i),s.charAt(len-1-i));
//        return words;
    }
}
