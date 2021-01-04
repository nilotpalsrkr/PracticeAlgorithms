package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathwithMaximumGold_1219_testTest {

    @Test
    void getMaximumGold3() {
        int[][] arr = {
                {1,0,7},
                {2,0,6},
                {3,4,5},
                {0,3,0},
                {9,0,20}
        };
        PathwithMaximumGold_1219_test pathwithMaximumGold_1219 = new PathwithMaximumGold_1219_test();
        int maxCoins = pathwithMaximumGold_1219.getMaximumGold(arr);
        assertEquals(60, maxCoins);
    }
}