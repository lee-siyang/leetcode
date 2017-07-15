import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/15.
 */
public class ValidParenthesesTest {
    Valid_Parentheses validParentheses = new Valid_Parentheses();
    @Test
    public void valiPareTest(){

        String str = ""+validParentheses.isValid("[");
        System.out.println(str);
        assertEquals("false",str);
    }
}
