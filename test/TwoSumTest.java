import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/14.
 */
public class TwoSumTest {
    Two_Sum two_sum = new Two_Sum();
    @Test
    public void testTwo_sum(){
        int[] nums = {2, 7, 11, 15};
        int[] res = two_sum.twoSum(nums,9);
        assertEquals("[0, 1]", Arrays.toString(res));
    }

}
