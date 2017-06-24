import java.util.Arrays;


/**
 * Created by lisiyang on 17/6/24.
 * https://leetcode.com/problems/assign-cookies/#/description
 * 455. Assign Cookies
 */
public class Assign_Cookies {
    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1,2,3};
        System.out.println(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
//
//        int children = g.length-1;
//        int cookies = 0;
//        while (children>=0 && cookies<s.length){
//            if (s[cookies]>=g[children]){
//                count = Math.min(s.length,g.length);
//            }
//            else {
//                cookies++;
//                if (cookies==s.length-1 && children!=g.length-1){
//
//                }
//            }
//        }

            for (int j =0;j<s.length && count<g.length;j++){
                if (s[j]>=g[count]){
                    count++;
                }
            }

        return count;
    }
}
