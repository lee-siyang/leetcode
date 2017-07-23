/**
 * Created by lisiyang on 17/7/23.
 * https://leetcode.com/problems/length-of-last-word/#/description
 * 58. Length of Last Word
 */
public class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
//        if (s.length()==0 || s.isEmpty()) return 0;
        while (s.length()!=0 && s.substring(s.length()-1,s.length()).equals(" ") ){
            s = s.substring(0,s.length()-1);
//            int len = s.length();
        }
        if (s.length()==0 || s.isEmpty()) return 0;
//        if (s.substring(s.length()-1,s.length()).equals(" ") && s.length()==1) return 0;
        String[] words = s.split(" ");
        int len = words.length;
        return words[len-1].length();
    }

}
