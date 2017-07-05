import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/5.
 */
public class climbStairsTest {
    Climbing_Stairs climbingStairs = new Climbing_Stairs();
    @Test
    public void test(){
        int i = climbingStairs.climbStairs(5);
        assertEquals(8,i);
    }
}
