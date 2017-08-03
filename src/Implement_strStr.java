/**
 * Created by lisiyang on 17/8/3.
 * https://leetcode.com/problems/implement-strstr/description/
 * 28. Implement strStr()
 */
public class Implement_strStr {
    public int strStr(String haystack, String needle) {
        if (haystack.length()<needle.length()) return -1;
        int ans = haystack.toLowerCase().indexOf(needle.toLowerCase());
        return ans;
    }
    public static void main(String[] args){
        Implement_strStr s = new Implement_strStr();
        System.out.println(s.strStr("apple","pineapple"));
    }
}
