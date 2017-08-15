/**
 * Created by lisiyang on 17/8/15.
 * https://leetcode.com/problems/excel-sheet-column-title/description/
 * 168. Excel Sheet Column Title
 */
public class Excel_Sheet_Column_Title {
    public String convertToTitle(int n) {
        StringBuilder str = new StringBuilder();

        while (n>0){
            n--;
            str.insert(0,(char)(n%26+'A'));
            n /= 26;
        }
        return new String(str);
    }
}
