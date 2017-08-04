import org.junit.Test;

/**
 * Created by lisiyang on 17/8/4.
 */
public class CountPrimeTest {
    Count_Primes countPrimes = new Count_Primes();
    @Test
    public void pTest(){
        int[] num = {2,3,4,5,6,7,8,1500000};
        for (int i : num){
            System.out.println(countPrimes.countPrimes(i));
        }
    }
}
