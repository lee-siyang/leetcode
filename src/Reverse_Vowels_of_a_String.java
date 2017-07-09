import java.util.Stack;

/**
 * Created by lisiyang on 17/7/9.
 * https://leetcode.com/problems/reverse-vowels-of-a-string/#/description
 * 345. Reverse Vowels of a String
 */
public class Reverse_Vowels_of_a_String {
    static final String vowels = "aeiouAEIOU";
    public String reverseVowels(String s) {
        if (s==null || s.length()==0)
            return "";
        char[] chars = s.toCharArray();
        int first = 0;
        int last = s.length()-1;
        while (first<last){
            while (first<last && vowels.indexOf(chars[first])==-1){
                first++;
            }
            while (first<last && vowels.indexOf(chars[last])==-1){
                last--;
            }
            char temp = chars[first];
            chars[first++] = chars[last];
            chars[last--] = temp;
        }
        return new String(chars);
//        Stack<Character> vowels = new Stack<>();
//        for (int i = 0;i<s.length();i++){
//            switch (s.charAt(i)){
//                case 'a':
//                case 'e':
//                case 'i':
//                case 'o':
//                case 'u':
//                case 'A':
//                case 'E':
//                case 'I':
//                case 'O':
//                case 'U':
//                    vowels.push(s.charAt(i));break;
//            }
//        }
//        String reverse = "";
//        for (int i = 0;i<s.length();i++){
//            switch (s.charAt(i)){
//                case 'a':
//                case 'e':
//                case 'i':
//                case 'o':
//                case 'u':
//                case 'A':
//                case 'E':
//                case 'I':
//                case 'O':
//                case 'U':
//                    reverse = reverse + vowels.pop();break;
//                default:
//                    reverse= reverse + s.charAt(i);break;
//            }
//        }
//        return reverse;
    }
}
