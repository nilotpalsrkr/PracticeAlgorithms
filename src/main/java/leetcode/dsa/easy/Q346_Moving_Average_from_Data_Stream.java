package leetcode.dsa.easy;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q346_Moving_Average_from_Data_Stream {
    /** Initialize your data structure here. */
    Queue<Integer> queue = null;
    public Q346_Moving_Average_from_Data_Stream(int size) {
        queue = new PriorityQueue<>(size);

    }

    public double next(int val) {
        queue.offer(val);
        int sum = 0;
        int count = 0;
        while(!queue.isEmpty()) {
            sum = sum + queue.poll();
            count++;
        }
        return (double)sum/(double)count;
    }
}
