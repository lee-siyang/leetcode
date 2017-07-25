import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/25.
 */
public class UnsortedSubTest {
    Shortest_Unsorted_Continuous_Subarray unsort = new Shortest_Unsorted_Continuous_Subarray();
    @Test
    public void subTest(){
        int[] nums = {1,3,2,2,2};
        int res = unsort.findUnsortedSubarray(nums);
        assertEquals(4,res);
    }
}
