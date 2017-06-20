/**
 * Created by lisiyang on 17/6/20.
 * https://leetcode.com/problems/find-the-difference/#/description
 * 389. Find the Difference
 */
public class Find_the_Difference {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcde";
        System.out.println(findTheDifference(str1, str2));
    }
    public static char findTheDifference(String s, String t) {
        boolean found = false;
        char[] ans = new char[1];
        for (int i = 0; !found && i<t.length();i++){
            if (!s.contains(t.substring(i,i+1))){
                found = true;
                ans = t.substring(i,i+1).toCharArray();
            }

        }
        return ans[0];
    }
}
