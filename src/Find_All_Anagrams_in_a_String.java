import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lisiyang on 17/7/14.
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/#/description
 * 438. Find All Anagrams in a String
 */
public class Find_All_Anagrams_in_a_String {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        if (s.length()==0 || s.length()<p.length()){
            return null;
        }

        int[] alphabet = new int[26];
//        for (int i = 0; i < p.length(); i++){
//            alphabet[p.charAt(i)-'a']++;
//        }
        for (char c : p.toCharArray()){
            alphabet[c - 'a']++;
        }

        int start = 0, end = 0, count = p.length();

        while (end<s.length()){
            if (end - start == p.length() && alphabet[s.charAt(start++)-'a']++ >=0)
                count++;
            if (--alphabet[s.charAt(end++)-'a'] >= 0)
                count--;
            if (count == 0)
                list.add(start);
        }
        return list;
//        List<Integer> res = new ArrayList<>();
////        List<Character> pList = new ArrayList<>();
//        Map<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i<p.length(); i++){
//            map.put(p.charAt(i),1);
//        }
//        for (int i = 0; i<s.length()-p.length(); i++){
//            int sum = 0;
//            for (int j = 0;j<p.length();j++){
//                sum += map.getOrDefault(s.charAt(j+i),0);
//            }
//            if (sum == p.length()){
//                res.add(i);
//            }
//        }
//        return res;
    }
}
