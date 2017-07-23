import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/23.
 */
public class LengthOfWordTest {
    Length_of_Last_Word lengthOfLastWord = new Length_of_Last_Word();
    @Test
    public void len(){
        String string = " a    ";
        int l = lengthOfLastWord.lengthOfLastWord(string);
        assertEquals(1,l);
    }
}
