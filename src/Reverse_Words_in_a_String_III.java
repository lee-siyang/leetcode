/**
 * Created by lisiyang on 17/6/11.
 */
public class Reverse_Words_in_a_String_III {
    public static void main(String[] args) {
        String s ="Let's take LeetCode contest";
//        System.out.println(s.length());
        //String res = reverseString(s);
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] strs = s.split(" ");
        String reverse = "";
        //int len = 0;
        for (String str:strs){
//            System.out.println(str);
            int len = str.length();
//            System.out.println(len);
            char[] res = new char[len];
            for (int i = 0; i <= len - 1; i++) {
                res[i] = str.charAt(len - 1 - i);
            }
//            System.out.println(new String(res));
            reverse = reverse+ new String(res)+" ";
        }
//        System.out.println(reverse.substring(0,reverse.length()).length());
//        for(int j=0;j<strs.length;j++) {
//            String str = strs[j];
//            int len = str.length();
//            char[] res = new char[len];
//            for (int i = 0; i <= len - 1; i++) {
//                res[i] = s.charAt(len - 1 - i);
//            }
//            reverse = reverse+ new String(res)+" ";
//        }
        return reverse.substring(0,reverse.length()-1);
//        String words=s;
//        for (int i=0;i<len/2;i++)
//            words=s.replace(s.charAt(i),s.charAt(len-1-i));
//        return words;
    }
}
