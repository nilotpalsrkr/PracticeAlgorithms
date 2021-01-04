package leetcode.dsa.medium;
/*
https://leetcode.com/problems/path-with-maximum-gold/
 */
import java.util.ArrayList;
import java.util.List;

public class PathwithMaximumGold_1219_test {
    int max = 0;

    public void func(int[][] grid, int row, int col, int x, int y, int sumSoFar) {

        if(x>=0 && x < row && y>=0 && y<col) {
            max = Math.max(max, sumSoFar);
            if(grid[x][y] == 0) {
                return;
            }
            int value = grid[x][y];
            grid[x][y] = 0;
            func(grid, row, col, x+1, y, sumSoFar+value);
            func(grid, row, col, x-1, y, sumSoFar+value);
            func(grid, row, col, x, y+1, sumSoFar+value);
            func(grid, row, col, x, y-1, sumSoFar+value);

            grid[x][y] = value;
        }

    }





    public int getMaximumGold(int[][] grid) {

        if(grid == null || grid.length == 0)
            return 0;

        int row = grid.length;
        int col = grid[0].length;

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                func(grid, row, col, i,j,0);
            }
        }

        return max;


    }

}
