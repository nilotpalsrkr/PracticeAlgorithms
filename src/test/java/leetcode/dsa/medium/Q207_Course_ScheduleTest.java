package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q207_Course_ScheduleTest {

    @Test
    void canFinish() {
        Q207_Course_Schedule q207_course_schedule = new Q207_Course_Schedule();
        int[][] input = {{1,0},{0,1}};
        boolean result = q207_course_schedule.canFinish(2, input);
        assertEquals(false, result);
    }
    @Test
    void canFinish1() {
        Q207_Course_Schedule q207_course_schedule = new Q207_Course_Schedule();
        int[][] input = {{1,0},{0,2}};
        boolean result = q207_course_schedule.canFinish(2, input);
        assertEquals(true, result);
    }

    @Test
    void canFinish2() {
        Q207_Course_Schedule q207_course_schedule = new Q207_Course_Schedule();
        int[][] input = {{1,0},{0,2}, {0,3}, {2,3}};
        boolean result = q207_course_schedule.canFinish(2, input);
        assertEquals(true, result);
    }
    @Test
    void canFinish3() {
        Q207_Course_Schedule q207_course_schedule = new Q207_Course_Schedule();
        int[][] input = {{1,0},{0,2}, {3,0}, {2,3}};
        boolean result = q207_course_schedule.canFinish(2, input);
        assertEquals(false, result);
    }

    @Test
    void canFinish4() {
        Q207_Course_Schedule q207_course_schedule = new Q207_Course_Schedule();
        int[][] input = {{1,0},{0,2}, {3,0}, {2,3}, {3,1}};
        boolean result = q207_course_schedule.canFinish(2, input);
        assertEquals(false, result);
    }
    @Test
    void canFinish5() {
        Q207_Course_Schedule q207_course_schedule = new Q207_Course_Schedule();
        int[][] input = {};
        boolean result = q207_course_schedule.canFinish(2, input);
        assertEquals(true, result);
    }

    @Test
    void canFinish6() {
        Q207_Course_Schedule q207_course_schedule = new Q207_Course_Schedule();
        int[][] input = {{1,0},{2,0},{3,1},{3,2}};
        boolean result = q207_course_schedule.canFinish(2, input);
        assertEquals(true, result);
    }
}