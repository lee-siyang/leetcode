import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/8.
 */
public class RemoveElementsTest {
    Remove_Element re = new Remove_Element();
    @Test
    public void setRemoveElementsTest(){
        int[] nums={3,2,2,3,2,3,4,5,6,7,8};
        int e = re.removeElement(nums,3);
        assertEquals(8,e);
    }
}
