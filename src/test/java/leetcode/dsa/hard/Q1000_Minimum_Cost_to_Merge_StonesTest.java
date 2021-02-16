package leetcode.dsa.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1000_Minimum_Cost_to_Merge_StonesTest {

    @Test
    public void mergeStones1() {
        int[] stones = {3,2,4,1};
        int K = 2;

        Q1000_Minimum_Cost_to_Merge_Stones q1000_minimum_cost_to_merge_stones = new Q1000_Minimum_Cost_to_Merge_Stones();
        int result = q1000_minimum_cost_to_merge_stones.mergeStones(stones, K);
        assertEquals(20, result);
    }
}