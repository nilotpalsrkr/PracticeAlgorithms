package leetcode.dsa.easy;

import java.util.ArrayList;
import java.util.List;

public class Q1380_Lucky_Numbers_in_a_Matrix {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
    int[] colMax = matrix[0];
    int colSize = matrix[0].length;
    int rowSize = matrix.length;
    int[] rowMin = new int[rowSize];

        for(int row = 0; row < rowSize; row++) {
            int rowMinTemp = matrix[row][0];
            for(int col = 0; col < colSize; col++) {
                colMax[col] = colMax[col] > matrix[row][col] ? colMax[col] : matrix[row][col];
                rowMinTemp = rowMinTemp < matrix[row][col] ? rowMinTemp : matrix[row][col];
            }
            rowMin[row] = rowMinTemp;
        }

        for(int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                if(colMax[col] == rowMin[row]) result.add(colMax[col]);
            }
        }

        return result;
    }
}
