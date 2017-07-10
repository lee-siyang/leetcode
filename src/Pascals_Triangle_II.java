import java.util.ArrayList;
import java.util.List;

/**
 * Created by lisiyang on 17/7/10.
 * https://leetcode.com/problems/pascals-triangle-ii/#/description
 * 119. Pascal's Triangle II
 */
public class Pascals_Triangle_II {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for (int i =0;i<rowIndex+1;i++){
            res.add(0,1);
            for (int j = 1;j<res.size()-1;j++){
                res.set(j,res.get(j)+res.get(j+1));
            }
        }
        return res;
    }
}
