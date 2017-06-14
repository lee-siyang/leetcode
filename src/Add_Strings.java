/**
 * Created by lisiyang on 17/6/13.
 * https://leetcode.com/problems/add-strings/#/description
 * 415. Add Strings
 */
public class Add_Strings {
    public static void main(String[] args) {
        String num1 = "12345";
        String num2 = "23456";
        System.out.println(addStrings(num1,num2));
    }
    public static String addStrings(String num1, String num2) {
        char[] charNum1 = num1.toCharArray();
        char[] charNum2 = num2.toCharArray();
        int lenNum1 = charNum1.length;
        int lenNum2 = charNum2.length;
        int carry = 0;
        char[] ans = new char[Math.max(lenNum1,lenNum2)+1];
        for(int i = 0;i<Math.max(lenNum1,lenNum2);i++){
            int n1 = charNum1[lenNum1-1-i]-'0';
            int n2 = charNum2[lenNum2-1-i]-'0';
            if(n1+n2>9) {
                ans[i] = (char)((n1+n2)%10 + '0'+carry);
                carry = 1;
            }
        }
        return null;
    }
}
