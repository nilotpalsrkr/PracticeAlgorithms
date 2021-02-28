package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Q56_Merge_IntervalsTest {

    @Test
    void merge() {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        Q56_Merge_Intervals q56_merge_intervals = new Q56_Merge_Intervals();
        int[][] result = q56_merge_intervals.merge(intervals);

        for(int[] arr : result) {
            Arrays.stream(arr).forEach(x -> System.out.print(String.valueOf(x)));
            System.out.println();
        }
    }
}