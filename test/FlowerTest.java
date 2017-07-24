import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lisiyang on 17/7/23.
 */
public class FlowerTest {
    Can_Place_Flowers flowers = new Can_Place_Flowers();
    @Test
    public void flowersT(){
        int[] flower = {0,0,0,1,0,0,0,1,0};
        String s = ""+flowers.canPlaceFlowers(flower,2);
        assertEquals("true",s);
    }
}
