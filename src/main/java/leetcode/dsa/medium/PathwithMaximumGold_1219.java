package leetcode.dsa.medium;
/*
https://leetcode.com/problems/path-with-maximum-gold/
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PathwithMaximumGold_1219 {
    public int getMaximumGold(int[][] grid) {
        int maxCoins = 0;
        int cols = grid[0].length;
        int rows = grid.length;
        for(int i=0; i<rows ; i++) {
            for(int j = 0; j< cols ; j++) {
                maxCoins = Math.max(maxCoins, collectMaxCoins(grid, rows, cols, i, j, new HashSet<>()));

            }
        }
        return maxCoins;
    }

    int collectMaxCoins(int[][] grid, int n, int m, int x, int y, Set<String> visitedList) {
        if (isWithinArrayLimits(n,m,x,y) && !visitedList.contains(String.format("%d,%d", x, y)) && grid[x][y] !=0) {
            String visited = String.format("%d,%d", x, y);
            visitedList.add(visited);
            //if (x == n - 1 && y == m - 1) return grid[n - 1][m - 1];
/*
            if (x == n || y == m) return 0;
            if (x < 0 || y < 0) return 0;
*/

            int up = collectMaxCoins(grid, n, m, x - 1,y,visitedList);
            int down = collectMaxCoins(grid, n, m, x + 1, y,visitedList);
            int left = collectMaxCoins(grid, n, m, x, y - 1, visitedList);
            int right = collectMaxCoins(grid, n, m, x, y + 1, visitedList);

            int maxCoins = grid[x][y] + Math.max(right, Math.max(left, Math.max(up, down)));
            visitedList.remove(visited);
            return maxCoins;

        }
        else return 0;
    }

    private boolean isWithinArrayLimits(int n, int m, int x, int y) {
        if(x >=0 && x <n && y>=0 && y<m ) return true; else return false;
    }

}
