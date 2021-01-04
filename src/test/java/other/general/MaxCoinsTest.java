package other.general;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxCoinsTest {

    @Test
    void maxCoinsRecur() {
        int[][] arr = {
                {1,1,0,0},
                {1,1,1,1},
                {1,0,1,1},
                {0,0,0,1}
        };
        MaxCoins maxCoins = new MaxCoins();
        int maxCoinsCollected = maxCoins.maxCoinsRecur(arr,arr[0].length,arr.length, 0,0);
        assertEquals(7, maxCoinsCollected);
    }
}