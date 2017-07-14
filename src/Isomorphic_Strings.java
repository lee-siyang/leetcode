import java.util.HashMap;
import java.util.Map;

/**
 * Created by lisiyang on 17/7/14.
 * https://leetcode.com/problems/isomorphic-strings/#/description
 * 205. Isomorphic Strings
 */
public class Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();

        for (int i = 0;i < s.length();i++){
            if (mapS.get(s.charAt(i))==null){
                mapS.put(s.charAt(i),t.charAt(i));
            }
            if (mapT.get(t.charAt(i))==null){
                mapT.put(t.charAt(i),s.charAt(i));
            }
            if (mapS.get(s.charAt(i))!=t.charAt(i) || mapT.get(t.charAt(i))!=s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
