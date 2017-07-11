import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/11.
 */
public class RemoveDupTest {
    Remove_Duplicates_from_Sorted_Array re = new Remove_Duplicates_from_Sorted_Array();
    @Test
    public void ReDuTest(){
        int[] nums = {1,1,1,2,5,8,8,9};
        int count = re.removeDuplicates(nums);
        assertEquals(5,count);
    }
}
