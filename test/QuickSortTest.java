import org.junit.Test;

import java.util.Arrays;

/**
 * Created by lisiyang on 17/7/10.
 */
public class QuickSortTest {
    ArrayQuickSortTest_II quick = new ArrayQuickSortTest_II();
    @Test
    public void sortTest(){
        int[] nums = {13,81,92,43,31,65,57,26,75,0};
//        System.out.println(Arrays.toString(nums));
        ArrayQuickSortTest_II.quicksort(nums);
    }
}
