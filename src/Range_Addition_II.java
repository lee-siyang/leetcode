import java.util.Arrays;

/**
 * Created by lisiyang on 17/6/22.
 * https://leetcode.com/problems/range-addition-ii/#/description
 * 598. Range Addition II
 */
public class Range_Addition_II {
    public static void main(String[] args){
        int[][] ops = {{2,2},{3,3}};
        final int row = 3;
        final int column = 3;
        int[][] init = new int[row][column];
        for (int i=0;i<row;i++) {
            Arrays.fill(init[i], 0);
        }
        System.out.println(maxCount(row,column,ops));
    }
    public static int maxCount(int m, int n, int[][] ops) {
        if (ops==null || ops.length==0)
            return m*n;
//        int len = ops.length;
        int r=40000;int c=40000;
        for (int[] op:ops){
           r = Math.min(r,op[0]);
           c = Math.min(c,op[1]);
        }
        return r*c;
    }
}
