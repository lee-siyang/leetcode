/**
 * Created by lisiyang on 17/7/9.
 * https://leetcode.com/problems/plus-one/#/description
 * 66. Plus One
 */
public class Plus_One {
    public int[] plusOne(int[] digits) {
        for (int i=digits.length-1;i>=0;i--){
            if (digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] carry = new int[digits.length+1];
        carry[0]=1;
        return carry;
    }
}
