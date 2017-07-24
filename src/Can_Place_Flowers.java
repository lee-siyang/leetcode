import java.util.Arrays;

/**
 * Created by lisiyang on 17/7/23.
 * https://leetcode.com/problems/can-place-flowers/#/description
 * 605. Can Place Flowers
 */
public class Can_Place_Flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

//        String flower = Arrays.toString(flowerbed);
//        flower=flower.replace("[","");
//        flower = flower.replace("]","");
//        flower=flower.replace(", ","");
//        String flower = "";
//        for (int i:flowerbed){
//            flower = flower+i;
//        }
////        System.out.println(flower);
//        String[] zeros = flower.split("1");
//        int count = 0;
//        for (String s : zeros){
//
//            if (s.length()>0) {
//                count += Math.max(0, (s.length() - 1) / 2);
//            }
//
//        }
//        return n == count;
        int count = 1;
        int result = 0;
        for (int i:flowerbed){
            if (i==0){
                count++;
            }
            else{
                result += (count-1)/2;
                count=0;
            }
        }
        if (count != 0 ) result+=count/2;
        return result>=n;
    }
}
