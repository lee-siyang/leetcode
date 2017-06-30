import java.util.ArrayList;
import java.util.List;

/**
 * Created by lisiyang on 17/6/30.
 * https://leetcode.com/problems/binary-watch/#/description
 * 401. Binary Watch
 */
public class Binary_Watch {
    public static void main(String[] args){
        List<String> time = readBinaryWatch(2);

//        System.out.println(time.toArray());
    }
    public static List<String> readBinaryWatch(int num) {
        ArrayList<String> result = new ArrayList<>();
        for (int i=0;i<12;i++){
            for (int j = 0;j<60;j++){
                if (Integer.bitCount(i)+Integer.bitCount(j)==num)
                    result.add(String.format("%d:%02d",i,j));
            }
        }
//        for (String s:result)
//            System.out.println(s);
        return result;
    }
}
