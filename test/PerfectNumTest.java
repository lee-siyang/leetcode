import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/14.
 */
public class PerfectNumTest {
    Perfect_Number perfectNumber = new Perfect_Number();
    @Test
    public void testPerfectNumber(){
        boolean isPerfect = perfectNumber.checkPerfectNumber(496);
        assertEquals("true",""+isPerfect);
    }
}
