import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by lisiyang on 17/7/3.
 */
public class MyBase7Test {
    @Test
    public void testBase7(){
        int i = 101;
        String res = Base_7.convertToBase7(i);
        assertEquals("203",res);

    }
    @Test
    public void testReverseString(){
        String str = Reverse_String.reverseString("hello");
        assertEquals("olleh",str);
    }
}
