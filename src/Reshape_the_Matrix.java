/**
 * Created by lisiyang on 17/6/15.
 * https://leetcode.com/problems/reshape-the-matrix/#/description
 * 566. Reshape the Matrix
 */
public class Reshape_the_Matrix {
    public static void main(String[] args) {
        int[][] test = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] res = matrixReshape(test, 6, 2);
        for(int i=0;i<6;i++){
            for(int j = 0;j<2;j++)
            System.out.printf("%4d",res[i][j]);
            System.out.println();
        }

    }
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        int column = nums[0].length;
        if(row*column != r*c) return nums;
        int[][] res = new int[r][c];
        int ro=0;int co=0;
        for (int i = 0;i<row;i++){
            for(int j=0;j<column;j++){
                res[ro][co] = nums[i][j];
                co++;
                if(co==c){
                    co=0;
                    ro++;
                }
            }
        }
        return res;
    }
}
