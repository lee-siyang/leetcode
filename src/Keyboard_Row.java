/**
 * Created by lisiyang on 17/6/9.
 * 500. Keyboard Row
 * https://leetcode.com/problems/keyboard-row/#/description
 * Hash Table
 */
import  java.util.ArrayList;
import  java.util.HashMap;
import  java.util.List;
public class Keyboard_Row {
    public static void main(String[] args) {
        String[] s = {"Hello", "Alaska", "Dad", "Peace"};
        //String res = reverseString(s);
        String[] ans = findWords(s);
        for(int i=0;i<ans.length;i++)
            System.out.println(ans[i]);
    }
//    public static String[] findWords(String[] words) {
//        int len = words.length;
//        String[] table = {"qwertyuiop","asdfghjkl","zxcvbnm"};
//        for(int i=0;i<len;i++){
//            for(int j=0;j<words[i].length();j++){
//                if(words[i].charAt(j)==table.)
//            }
//        }
//        return new String[]{};
//    }
    public static String[] findWords(String[] words) {

    String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

    HashMap<Character, Integer> keyboard = new HashMap<>();
    for (int i=0; i<rows.length; ++i) {
        for (char c: rows[i].toCharArray()) {
            keyboard.put(c, i);
        }
    }

    List<String> result = new ArrayList<>();
    for (String w: words) {
        char[] letters = w.toLowerCase().toCharArray();

        boolean sameRow = true;
        int rowIndex = keyboard.get(letters[0]);
        for (char c: letters) {
            if (rowIndex != keyboard.get(c)) {
                sameRow = false;
                break;
            }
        }

        if (sameRow) result.add(w);
    }

    return result.stream().toArray(String[]::new);
}
}

/*
public String[] findWords(String[] words) {

        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

        HashMap<Character, Integer> keyboard = new HashMap<>();
        for (int i=0; i<rows.length; ++i) {
            for (char c: rows[i].toCharArray()) {
                keyboard.put(c, i);
            }
        }

        List<String> result = new ArrayList<>();
        for (String w: words) {
            char[] letters = w.toLowerCase().toCharArray();

            boolean sameRow = true;
            int rowIndex = keyboard.get(letters[0]);
            for (char c: letters) {
                if (rowIndex != keyboard.get(c)) {
                    sameRow = false;
                    break;
                }
            }

            if (sameRow) result.add(w);
        }

        return result.stream().toArray(String[]::new);
    }
 */