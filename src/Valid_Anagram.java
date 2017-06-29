/**
 * Created by lisiyang on 17/6/29.
 * https://leetcode.com/problems/valid-anagram/#/description
 * 242. Valid Anagram
 */
public class Valid_Anagram {
    public static void main(String[] args){
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length()==0 &&t.length()==0)
            return true;
        if (s.length()!=t.length())
            return false;

        s.toLowerCase();
        t.toLowerCase();

        int[] alphabet = new int[26];
        for (int i = 0;i<s.length();i++){
            alphabet[s.charAt(i)-'a']++;
        }
        for (int i=0;i<t.length();i++){
            if (--alphabet[t.charAt(i) -'a']<0)
                return false;
        }
        return true;
    }
}
