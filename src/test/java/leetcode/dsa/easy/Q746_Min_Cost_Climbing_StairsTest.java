package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q746_Min_Cost_Climbing_StairsTest {

    @Test
    void minCostClimbingStairs() {
        int[] input = {10,15,20};
        Q746_Min_Cost_Climbing_Stairs q746_min_cost_climbing_stairs = new Q746_Min_Cost_Climbing_Stairs();
        int result = q746_min_cost_climbing_stairs.minCostClimbingStairs(input);

        assertEquals(15, result);
    }

    @Test
    void minCostClimbingStairs1() {
        int[] input = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        Q746_Min_Cost_Climbing_Stairs q746_min_cost_climbing_stairs = new Q746_Min_Cost_Climbing_Stairs();
        int result = q746_min_cost_climbing_stairs.minCostClimbingStairs(input);

        assertEquals(6, result);
    }
    @Test
    void minCostClimbingStairs2() {
        int[] input = {1, 0, 1, 1};
        Q746_Min_Cost_Climbing_Stairs q746_min_cost_climbing_stairs = new Q746_Min_Cost_Climbing_Stairs();
        int result = q746_min_cost_climbing_stairs.minCostClimbingStairs(input);

        assertEquals(1, result);
    }
}