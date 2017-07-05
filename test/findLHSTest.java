import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/5.
 */
public class findLHSTest {
    Longest_Harmonious_Subsequence longestHarmoniousSubsequence =new Longest_Harmonious_Subsequence();
    @Test
    public void find(){
        int[] nums = {1,3,2,2,5,2,3,4,4,4,4,4,7};
        int len = longestHarmoniousSubsequence.findLHS(nums);
        assertEquals(7,len);
    }
}
