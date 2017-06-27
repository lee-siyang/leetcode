/**
 * Created by lisiyang on 17/6/27.
 * https://leetcode.com/problems/excel-sheet-column-number/#/description
 * 171. Excel Sheet Column Number
 */
public class Excel_Sheet_Column_Number {
    public static void main(String[] args) {
        String str = "AB";
        System.out.println(titleToNumber(str));
    }
    public static int titleToNumber(String s) {
        int len = s.length();
        int res = 0;
        for (int i = 0;i<len;i++){
            res*=26;
            res+=((s.charAt(i) - 'A') + 1);
        }
        return res;
    }
}
