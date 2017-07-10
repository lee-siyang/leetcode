import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lisiyang on 17/7/9.
 * https://leetcode.com/problems/pascals-triangle/#/description
 * 118. Pascal's Triangle
 */
public class Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows<1){return null;}
//        if (numRows==1){
//            List<Integer> inner = new LinkedList<>();
//            inner.add(1);
//            List<List<Integer>> outer = new LinkedList<>();
//            outer.add(inner);
//            return outer;
//        }
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        for (int i = 0;i<numRows;i++){
            inner.add(0,1);
            for (int j = 1;j < inner.size()-1;j++){
                inner.set(j, inner.get(j)+inner.get(j+1));
            }
            outer.add(new ArrayList<>(inner));
        }
        return outer;
    }
}
