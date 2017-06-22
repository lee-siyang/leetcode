import java.util.Arrays;

/**
 * Created by lisiyang on 17/6/22.
 * https://leetcode.com/problems/construct-the-rectangle/#/description
 * 492. Construct the Rectangle
 */
public class Construct_the_Rectangle {
    public static void main(String[] args){

        System.out.println(Arrays.toString(constructRectangle(4)));
    }
    public static int[] constructRectangle(int area) {
        int res[] = new int[2];
        for (int i = (int)(Math.sqrt(area));i>=1;i--){
            if (area%i==0){
                res[1]=i;
                res[0]=area/i;
                break;
            }
        }
        return res;
    }
}
