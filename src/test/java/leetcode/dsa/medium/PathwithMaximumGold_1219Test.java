package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathwithMaximumGold_1219Test {

    @Test
    void getMaximumGold1() {
        int[][] arr = {
                {0,1,6,0},
                {5,1,8,0},
                {2,1,9,0}
        };
        PathwithMaximumGold_1219 pathwithMaximumGold_1219 = new PathwithMaximumGold_1219();
        int maxCoins = pathwithMaximumGold_1219.getMaximumGold(arr);
        assertEquals(33, maxCoins);
    }
    @Test
    void getMaximumGold2() {
        int[][] arr = {
                {0,6},
                {5,8}
        };
        PathwithMaximumGold_1219 pathwithMaximumGold_1219 = new PathwithMaximumGold_1219();
        int maxCoins = pathwithMaximumGold_1219.getMaximumGold(arr);
        assertEquals(14, maxCoins);
    }

    @Test
    void getMaximumGold3() {
        int[][] arr = {
                {1,0,7},
                {2,0,6},
                {3,4,5},
                {0,3,0},
                {9,0,20}
        };
        PathwithMaximumGold_1219 pathwithMaximumGold_1219 = new PathwithMaximumGold_1219();
        int maxCoins = pathwithMaximumGold_1219.getMaximumGold(arr);
        assertEquals(60, maxCoins);
    }

    @Test
    void getMaximumGold4() {
        int[][] arr = {
                {1,0,7,0,0,0},{2,0,6,0,1,0},{3,5,6,7,4,2},{4,3,1,0,2,0},{3,0,5,0,20,0}
        };
        PathwithMaximumGold_1219 pathwithMaximumGold_1219 = new PathwithMaximumGold_1219();
        int maxCoins = pathwithMaximumGold_1219.getMaximumGold(arr);
        assertEquals(60, maxCoins);
    }
    //[[34,0,1,0,0,0],[0,0,2,0,1,0],[5,4,3,7,4,2],[0,0,5,0,1,4],[0,0,5,0,2,3]]
    @Test
    void getMaximumGold5() {
        int[][] arr = {
                {34,0,1,0,0,0},{0,0,2,0,1,0},{5,4,3,7,4,2},{0,0,5,0,1,4},{0,0,5,0,2,3}
        };
        PathwithMaximumGold_1219 pathwithMaximumGold_1219 = new PathwithMaximumGold_1219();
        int maxCoins = pathwithMaximumGold_1219.getMaximumGold(arr);
        assertEquals(36, maxCoins);
    }
}