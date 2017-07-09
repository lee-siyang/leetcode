/**
 * Created by lisiyang on 17/7/9.
 * https://leetcode.com/problems/repeated-substring-pattern/#/description
 * 459. Repeated Substring Pattern
 */
public class Repeated_Substring_Pattern {
    public boolean repeatedSubstringPattern(String s) {
        for (int i = s.length()/2;i>=1;i--){
            if (s.length()%i==0){
                String sub = s.substring(0,i);
                StringBuilder newS = new StringBuilder();
                for (int j = 0;j<s.length()/i;j++){
                    newS.append(sub);
                }
                if (s.equals(newS.toString())){
                    return true;
                }
            }
        }
        return false;
    }
}
