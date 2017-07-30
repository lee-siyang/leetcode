import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/30.
 */
public class KDiffPairsTest {
    Kdiff_Pairs_in_an_Array k = new Kdiff_Pairs_in_an_Array();
    @Test
    public void test(){
        int[] nums = {3, 1, 4, 1, 5};
        int ans = k.findPairs(nums, 2);
        assertEquals(2, ans);
    }
}
