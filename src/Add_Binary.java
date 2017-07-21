/**
 * Created by lisiyang on 17/7/21.
 * https://leetcode.com/problems/add-binary/#/description
 * 67. Add Binary
 */
public class Add_Binary {
    public String addBinary(String a, String b) {
        if (a.length()==0||a.isEmpty())return b;
        if (b.length()==0||b.isEmpty())return a;
        char[] aNum = a.toCharArray();
        char[] bNum = b.toCharArray();
        StringBuilder res = new StringBuilder();

        int i = a.length()-1;
        int j = b.length()-1;

        int carry=0;

        while (i>-1 || j>-1 ||carry==1){
            int aByte = (i>-1)?Character.getNumericValue(aNum[i--]):0;
            int bByte = (j>-1)?Character.getNumericValue(bNum[j--]):0;
            res.append(aByte^bByte^carry);
            carry = (aByte+bByte+carry)>=2?1:0;
        }

        return res.reverse().toString();
    }
}
