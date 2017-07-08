/**
 * Created by lisiyang on 17/7/8.
 * https://leetcode.com/problems/poor-pigs/#/description
 * 458. Poor Pigs
 */
public class Poor_Pigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int pigs = 0;
        int status = minutesToTest/minutesToDie+1;
        while(Math.pow(status,pigs)<buckets){
            pigs++;
        }
        return pigs;
    }
}
