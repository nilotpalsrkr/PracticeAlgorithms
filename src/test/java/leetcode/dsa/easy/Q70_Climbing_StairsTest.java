package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q70_Climbing_StairsTest {

    @Test
    void climbStairs() {
        int n = 3;
        Q70_Climbing_Stairs q70_climbing_stairs = new Q70_Climbing_Stairs();

        int result = q70_climbing_stairs.climbStairs(n);
        assertEquals(3, result);
    }
    @Test
    void climbStairs1() {
        int n = 5;
        Q70_Climbing_Stairs q70_climbing_stairs = new Q70_Climbing_Stairs();

        int result = q70_climbing_stairs.climbStairs(n);
        assertEquals(8, result);
    }
    @Test
    void climbStairs2() {
        int n = 0;
        Q70_Climbing_Stairs q70_climbing_stairs = new Q70_Climbing_Stairs();

        int result = q70_climbing_stairs.climbStairs(n);
        assertEquals(0, result);
    }
    @Test
    void climbStairs3() {
        int n = 45;
        Q70_Climbing_Stairs q70_climbing_stairs = new Q70_Climbing_Stairs();

        int result = q70_climbing_stairs.climbStairs(n);
        assertEquals(0, result);
    }
}