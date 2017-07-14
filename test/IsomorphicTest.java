import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/14.
 */
public class IsomorphicTest {
    Isomorphic_Strings is = new Isomorphic_Strings();
    @Test
    public void IsTest(){
        String s = "aa";
        String t = "ab";
        String re = ""+is.isIsomorphic(s,t);
        assertEquals("false",re);
    }
}
