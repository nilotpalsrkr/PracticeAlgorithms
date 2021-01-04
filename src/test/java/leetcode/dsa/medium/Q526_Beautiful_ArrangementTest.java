package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q526_Beautiful_ArrangementTest {

    @Test
    void countArrangement() {
        Q526_Beautiful_Arrangement q526_beautiful_arrangement = new Q526_Beautiful_Arrangement();
        int N = 2;
        int result = q526_beautiful_arrangement.countArrangement(N);
        assertEquals(2, result);
    }
    @Test
    void countArrangement1() {
        Q526_Beautiful_Arrangement q526_beautiful_arrangement = new Q526_Beautiful_Arrangement();
        int N = 3;
        int result = q526_beautiful_arrangement.countArrangement(N);
        assertEquals(3, result);
    }
}