import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/9.
 */
public class ReverseVowelsTest {
    Reverse_Vowels_of_a_String re = new Reverse_Vowels_of_a_String();
    @Test
    public void TestReVowels(){
        String[] strings = {"hello","leetcode","apple"};
        for (String str : strings){
            String reverse = re.reverseVowels(str);
//            assertEquals("holle",reverse);
            System.out.println(reverse);
        }
    }
}
