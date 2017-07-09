import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/9.
 */
public class PlusOneTest {
    Plus_One plusOne = new Plus_One();
    @Test
    public void plusTest(){
        int[] nums={1,3,9};
        int[] result = plusOne.plusOne(nums);
        System.out.println(Arrays.toString(result));
//        assertEquals("[2, 1, 2]", Arrays.toString(result));
    }
}
