package other.general;

public class MaxCoins {
    public int maxCoinsRecur(int[][] arr, int n, int m, int x, int y) {
        if(x == n-1 && y == m-1) return arr[n-1][m-1];
        if(x == n || y == m) return 0;

        int down = maxCoinsRecur(arr, n, m, x +1 , y);
        int right = maxCoinsRecur(arr, n, m, x, y+1 );

        return arr[x][y] + Math.max(down,right);
    }
}
