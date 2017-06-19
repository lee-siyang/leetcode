/**
 * Created by lisiyang on 17/6/19.
 * https://leetcode.com/problems/detect-capital/#/description
 * 520. Detect Capital
 */
public class Detect_Capital {
    public static void main(String[] args) {
        String test = "fLag";
//        System.out.println('z'-'A');
        System.out.println(detectCapitalUse(test));
    }
    public static boolean detectCapitalUse(String word) {
        return word.equals(word.toLowerCase())||
                word.equals(word.toUpperCase())||
                Character.isUpperCase(word.charAt(0)) &&
                        word.substring(1).equals(word.substring(1).toLowerCase());
    }
}
