import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/23.
 */
public class SquareSumTest {
    Sum_of_Square_Numbers sum = new Sum_of_Square_Numbers();
    @Test
    public void sqSum(){
        String ans = ""+sum.judgeSquareSum(5);
        assertEquals("true",ans);
    }
}
