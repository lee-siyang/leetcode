/**
 * Created by lisiyang on 17/8/4.
 * https://leetcode.com/problems/count-primes/description/
 * 204. Count Primes
 */
public class Count_Primes {
    public int countPrimes(int n) {
        int count = 0;
        if (n<2) return count;
//        if (n == 2) return count+1;
        for (int i = 3;i<n;i+=2){

            if (isPrime(i)){
                count++;
            }
        }
        return n>2?count+1:count;
    }
    private boolean isPrime(int num){
        for (int i = 3; i<=(int)Math.sqrt(num);i+=2){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

}
