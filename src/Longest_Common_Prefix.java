import java.util.Arrays;

/**
 * Created by lisiyang on 17/7/23.
 * https://leetcode.com/problems/longest-common-prefix/#/description
 * 14. Longest Common Prefix
 */
public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        int num = strs.length;
        StringBuilder sb = new StringBuilder();
        if (num > 0){
            Arrays.sort(strs);
            int first = strs[0].length();
            char[] f = strs[0].toCharArray();
            int last = strs[num-1].length();
            char[] l = strs[num-1].toCharArray();
            for (int i = 0; i<first; i++){
                if (i<last && f[i]==l[i]){
                    sb.append(f[i]);
                }
                else {
                    return sb.toString();
                }
            }
        }
        return sb.toString();
    }
}
