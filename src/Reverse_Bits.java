/**
 * Created by lisiyang on 17/7/25.
 * https://leetcode.com/problems/reverse-bits/#/description
 * 190. Reverse Bits
 */
public class Reverse_Bits {
    public static void main(String[] args){
        int n = 43261596;
        System.out.println(reverseBits(n));
    }
    public static int reverseBits(int n) {
//        StringBuilder sNum = new StringBuilder();
        int result = 0;
        for (int i = 0 ;i<32;i++){
            result += n & 1;
            n >>>= 1;
            if (i<31){
                result <<= 1;
            }
        }
        return result;
    }
}
