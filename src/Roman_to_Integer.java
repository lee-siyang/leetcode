import java.util.HashMap;

/**
 * Created by lisiyang on 17/6/29.
 * https://leetcode.com/problems/roman-to-integer/#/description
 * 13. Roman to Integer
 */
public class Roman_to_Integer {
    public static void main(String[] args){
        String s = "XII";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        if (s == null || s.length() == 0)
            return -1;
        HashMap<Character,Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        int res = romanMap.get(s.charAt(s.length()-1));
        for (int i = s.length()-1;i>0;i--){
            if(romanMap.get(s.charAt(i-1)) >= romanMap.get(s.charAt(i)))
                res += romanMap.get(s.charAt(i-1));
            else
                res -= romanMap.get(s.charAt(i-1));
        }
        return res;

    }
}
