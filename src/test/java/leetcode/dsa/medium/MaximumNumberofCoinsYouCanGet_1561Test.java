package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberofCoinsYouCanGet_1561Test {

    @Test
    void maxCoins1() {
        int[] piles = {2,4,1,2,7,8};
        MaximumNumberofCoinsYouCanGet_1561 maximumNumberofCoinsYouCanGet_1561 = new MaximumNumberofCoinsYouCanGet_1561();
        int maxCoinsActual = maximumNumberofCoinsYouCanGet_1561.maxCoins(piles);
        assertEquals(9, maxCoinsActual);
    }
    @Test
    void maxCoins2() {
        int[] piles = {2,4,5};
        MaximumNumberofCoinsYouCanGet_1561 maximumNumberofCoinsYouCanGet_1561 = new MaximumNumberofCoinsYouCanGet_1561();
        int maxCoinsActual = maximumNumberofCoinsYouCanGet_1561.maxCoins(piles);
        assertEquals(4, maxCoinsActual);
    }
    @Test
    void maxCoins3() {
        int[] piles = {9,8,7,6,5,1,2,3,4};
        MaximumNumberofCoinsYouCanGet_1561 maximumNumberofCoinsYouCanGet_1561 = new MaximumNumberofCoinsYouCanGet_1561();
        int maxCoinsActual = maximumNumberofCoinsYouCanGet_1561.maxCoins(piles);
        assertEquals(18, maxCoinsActual);
    }
}