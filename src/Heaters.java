import java.util.Arrays;

/**
 * Created by lisiyang on 17/7/25.
 * https://leetcode.com/problems/heaters/tabs/description
 * 475. Heaters
 */
public class Heaters {
    public int findRadius(int[] houses, int[] heaters) {
        int prevHeater = 0;
        int maxLength = 0;
        Arrays.sort(heaters);
        Arrays.sort(houses);
        for (int house : houses){
            while (prevHeater < heaters.length-1 && heaters[prevHeater] + heaters[prevHeater+1] <= house*2){
                prevHeater++;
            }
            maxLength = Math.max(maxLength,Math.abs(house-heaters[prevHeater]));
        }
        return maxLength;
    }
}
