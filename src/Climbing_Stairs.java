/**
 * Created by lisiyang on 17/7/5.
 * https://leetcode.com/problems/climbing-stairs/#/description
 * 70. Climbing Stairs
 */
public class Climbing_Stairs {
    public int climbStairs(int n) {
//        if (n<=0) return 0;
//        if (n==1) return 1;
//        if (n==2) return 2;
//        int res=0;
//        int oneStep = 1;
//        int twoStep = 2;
//        for (int i = 2;i<n;i++){
//            res = oneStep + twoStep;
//            twoStep = oneStep;
//            oneStep = res;
//        }

        if (n==0||n==1||n==2){
            return n;
        }
        int[] res = new int[n];
        res[0]=1;
        res[1]=2;
        for (int i =2;i<n;i++){
            res[i] = res[i-1]+res[i-2];
        }

        return res[n-1];
    }
}
