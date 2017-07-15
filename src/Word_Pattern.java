import java.util.HashMap;
import java.util.Map;

/**
 * Created by lisiyang on 17/7/15.
 * https://leetcode.com/problems/word-pattern/#/description
 * 290. Word Pattern
 */
public class Word_Pattern {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i=0; i<words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;
//        String[] strings = str.split(" ");
//        if (pattern.length() != strings.length) return false;
////        Map<Character, String> map = new HashMap<>();
////        int num = -1;
////        for (char c : pattern.toCharArray()){
////            if (!map.getOrDefault(c,strings[++num]).equals(strings[num])){
////                return false;
////            }
////        }
//        Map map = new HashMap();
//        for (int i = 0; i<strings.length; i++){
//            if (map.put(pattern.charAt(i),i) != map.put(strings[i], i))
//                return false;
//        }
//        return true;
    }
}
