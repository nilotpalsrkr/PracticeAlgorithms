package leetcode.dsa.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MaximumNumberofCoinsYouCanGet_1561 {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i = piles.length - 2 ;
        int maxCoins = 0;
        int maxLimit = piles.length/3;
        while(i >=maxLimit) {
            maxCoins = maxCoins + piles[i];
            i =  i - 2;
        }
        return maxCoins;
    }
}
