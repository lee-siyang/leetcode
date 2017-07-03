import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/3.
 */
public class SubSumTest {
    Subarray_Sum_Equals_K mySum = new Subarray_Sum_Equals_K();

    @Test
    public void sumTest(){
        int[] ints = {1};
        int count = mySum.subarraySum(ints,0);
        assertEquals(0,count);
    }

}
