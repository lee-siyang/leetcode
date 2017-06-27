/**
 * Created by lisiyang on 17/6/27.
 * https://leetcode.com/problems/first-unique-character-in-a-string/#/description
 * 387. First Unique Character in a String
 */
public class First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        String str = "loveleetcode";
        System.out.println(firstUniqChar(str));
    }
    public static int firstUniqChar(String s) {
        int[] alpha = new int[26];
        s.toLowerCase();
//        int res = -1;
        for (int i=0;i<s.length();i++){
            alpha[s.charAt(i)-'a']++;
        }
        for (int i=0;i<s.length();i++){
            if (alpha[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;
    }
}
