import java.util.Arrays;

/**
 * Created by lisiyang on 17/6/29.
 * https://leetcode.com/problems/longest-palindrome/#/description
 * 409. Longest Palindrome
 */
public class Longest_Palindrome {
    public static void main(String[] args){
        String s = "aaAaaa";
        System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {
        if (s.length()<2) return s.length();
        int[] alphabet = new int[26*2];
//        String lowS = s.toLowerCase();
//        System.out.println(s);
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)>='a' && s.charAt(i)<='z')
            alphabet[s.charAt(i)-'a']++;
            else if (s.charAt(i)>='A' && s.charAt(i)<='Z')
                alphabet[s.charAt(i)-'A'+26]++;
        }
//        System.out.println(Arrays.toString(alphabet));
        int count = 0;
        for (int i = 0;i<26*2;i++){
            if (alphabet[i] >1){
                count+=alphabet[i]/2*2;
            }
        }
        return s.length()-count>0?count+1:count;
    }
}
