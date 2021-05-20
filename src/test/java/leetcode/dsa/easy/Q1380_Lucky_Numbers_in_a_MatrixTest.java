package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q1380_Lucky_Numbers_in_a_MatrixTest {

    @Test
    void luckyNumbers() {
        int[][] input = {{3,7,8},{9,11,13,},{15,16,17}};
        Q1380_Lucky_Numbers_in_a_Matrix q1380_lucky_numbers_in_a_matrix = new Q1380_Lucky_Numbers_in_a_Matrix();
        List<Integer> result = q1380_lucky_numbers_in_a_matrix.luckyNumbers(input);
        assertEquals(15, result.get(0));
    }
    @Test
    void luckyNumbers1() {
        int[][] input = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        Q1380_Lucky_Numbers_in_a_Matrix q1380_lucky_numbers_in_a_matrix = new Q1380_Lucky_Numbers_in_a_Matrix();
        List<Integer> result = q1380_lucky_numbers_in_a_matrix.luckyNumbers(input);
        assertEquals(12, result.get(0));
    }
    @Test
    void luckyNumbers2() {
        int[][] input = {{7,8},{1,2}};
        Q1380_Lucky_Numbers_in_a_Matrix q1380_lucky_numbers_in_a_matrix = new Q1380_Lucky_Numbers_in_a_Matrix();
        List<Integer> result = q1380_lucky_numbers_in_a_matrix.luckyNumbers(input);
        assertEquals(7, result.get(0));
    }
    @Test
    void luckyNumbers3() {
        int[][] input = {{56216},{63251},{75772},{1945},{27014}};
        Q1380_Lucky_Numbers_in_a_Matrix q1380_lucky_numbers_in_a_matrix = new Q1380_Lucky_Numbers_in_a_Matrix();
        List<Integer> result = q1380_lucky_numbers_in_a_matrix.luckyNumbers(input);
        assertEquals(75772, result.get(0));
    }
}