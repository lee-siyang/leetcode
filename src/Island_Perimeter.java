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
        int row = grid.length;
        int column = grid[0].length;
        int neighbour = 0;
        int island = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    island++;
                    if (i < row - 1 && grid[i + 1][j] == 1)
                        neighbour++;
                    if (j < column - 1 && grid[i][j + 1] == 1)
                        neighbour++;
                }
            }
        }
        return 4 * island - 2 * neighbour;
    }
}
