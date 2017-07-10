/**
 * Created by lisiyang on 17/7/10.
 * https://leetcode.com/problems/number-of-segments-in-a-string/#/description
 * 434. Number of Segments in a String
 */
public class Number_of_Segments_in_a_String {
    public int countSegments(String s) {

        if (s==null || s.length()==0){
            return 0;
        }
        int count = s.charAt(0)==0?0:1;
        for (int i = 1;i<s.length();i++){
            count += s.charAt(i)!=' ' && s.charAt(i-1)==' '?1:0;
        }
        return count;
//        if (s.charAt(0)!=' ') {
//            String sNew = s.replace(" ", "");
//            return s.length() - sNew.length() + 1;
//        }
//        return 0;
    }
}
