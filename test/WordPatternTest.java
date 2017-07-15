import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/15.
 */
public class WordPatternTest {
    Word_Pattern word = new Word_Pattern();
    @Test
    public void testWordPattern(){
        String pattern = "abba";
        String str = "dog cat cat dog";
        String res = ""+word.wordPattern(pattern, str);
        assertEquals("true",res);
    }
}
