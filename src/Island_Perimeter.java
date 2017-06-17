/**
 * Created by lisiyang on 17/6/17.
 * https://leetcode.com/problems/island-perimeter/#/description
 * 463. Island Perimeter
 */
public class Island_Perimeter {
    public static void main(String[] args) {
        int[][] test = {{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}};
        System.out.println(islandPerimeter(test));
    }
    public static int islandPerimeter(int[][] grid) {
        int len = grid.length;
        int neighbour = 0;
        int island = 0;
        for (int i = 0;i<len;i++){
            for (int j = 0;j<len;j++){
                if (grid[i][j]==1){
                    island++;
                    if(i!=len-1 && grid[i+1][j]==1)
                        neighbour++;
                    if(j!=len-1 && grid[i][j+1]==1)
                        neighbour++;
                }
            }
        }
        return 4*island - 2*neighbour;
    }
}
