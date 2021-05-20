package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q621_Task_SchedulerTest {

    @Test
    void leastInterval() {
        char[] tasks = {'C','A','A','A','B','B','B','C'};
        Q621_Task_Scheduler q621_task_scheduler = new Q621_Task_Scheduler();
        q621_task_scheduler.leastInterval(tasks, 2);
    }
}