/**
 * Created by lisiyang on 17/6/16.
 * https://leetcode.com/problems/hamming-distance/#/description
 * 461. Hamming Distance
 */
public class Hamming_Distance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
    public static int hammingDistance(int x, int y) {
        int xor = x^y;
        int count=0;
        while(xor>0){
            count += xor&1;
            xor >>= 1;
        }
        return count;
    }
}
