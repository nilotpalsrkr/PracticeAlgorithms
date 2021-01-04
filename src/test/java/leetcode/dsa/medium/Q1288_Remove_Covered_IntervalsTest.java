package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q1288_Remove_Covered_IntervalsTest {

    @Test
    void removeCoveredIntervals() {
        int[][] intervals = {{1,4},{3,6},{2,8}};

        Q1288_Remove_Covered_Intervals q1288_remove_covered_intervals = new Q1288_Remove_Covered_Intervals();
        int result = q1288_remove_covered_intervals.removeCoveredIntervals(intervals);
        assertEquals(2, result);
    }
    @Test
    void removeCoveredInterval2() {
        int[][] intervals = {{1,4},{2,3}};

        Q1288_Remove_Covered_Intervals q1288_remove_covered_intervals = new Q1288_Remove_Covered_Intervals();
        int result = q1288_remove_covered_intervals.removeCoveredIntervals(intervals);
        assertEquals(1, result);
    }
    @Test
    void removeCoveredInterval3() {
        int[][] intervals = {{3,10},{4,10},{5,11}};

        Q1288_Remove_Covered_Intervals q1288_remove_covered_intervals = new Q1288_Remove_Covered_Intervals();
        int result = q1288_remove_covered_intervals.removeCoveredIntervals(intervals);
        assertEquals(2, result);
    }

    @Test
    void removeCoveredIntervals4() {
        int[][] intervals = {{1,2},{1,4},{3,4}};

        Q1288_Remove_Covered_Intervals q1288_remove_covered_intervals = new Q1288_Remove_Covered_Intervals();
        int result = q1288_remove_covered_intervals.removeCoveredIntervals(intervals);
        assertEquals(1, result);
    }
    @Test
    void testIntervalClass() {
        Interval interval = new Interval(new int [] {3,6});
        Interval interval1 = new Interval(new int[] {2,8});
        Interval interval2 = new Interval(new int[] {2,10});
        Interval interval3 = new Interval((new int[]{1,6}));
        List<Interval> list = Arrays.asList(interval2,interval, interval3,interval1);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}