/**
 * Created by lisiyang on 17/7/14.
 * https://leetcode.com/problems/perfect-number/#/description
 * 507. Perfect Number
 */
public class Perfect_Number {
    public boolean checkPerfectNumber(int num) {
        if (num==1) return false;
        int sum = 0;
        for (int i = 2;i<=(int)(Math.sqrt(num));i++){
            if (num % i == 0){
                sum += (i + num/i);
            }
        }
        return num==(sum+1);
    }
}
