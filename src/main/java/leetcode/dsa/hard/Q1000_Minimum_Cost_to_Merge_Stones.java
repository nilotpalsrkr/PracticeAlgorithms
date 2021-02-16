package leetcode.dsa.hard;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q1000_Minimum_Cost_to_Merge_Stones {
    public int mergeStones(int[] stones, int K) {
        Queue<Integer> queue = new LinkedList(Arrays.asList(stones));
        return sum(stones, 0, 0, 0, K, 1);
    }

    private int sum(int[] stones, int sumAsElment, int sum, int i, int k, int globalCount) {
        if(globalCount == stones.length) return sum;
        if(i == k) {
            sum = sum + sumAsElment;
            i =1;
        }
            try {
                sumAsElment = sumAsElment + stones[i];
                return sum(stones, sumAsElment, sum, ++i, k, ++globalCount);
            }catch (ArrayIndexOutOfBoundsException e) {
                return -1;
            }

    }
}
