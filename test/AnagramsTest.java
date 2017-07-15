import org.junit.Test;

import java.util.List;

/**
 * Created by lisiyang on 17/7/14.
 */
public class AnagramsTest {
    Find_All_Anagrams_in_a_String find = new Find_All_Anagrams_in_a_String();
    @Test
    public void testAnagrams(){
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> res = find.findAnagrams(s,p);
        System.out.println(res);
    }
}
