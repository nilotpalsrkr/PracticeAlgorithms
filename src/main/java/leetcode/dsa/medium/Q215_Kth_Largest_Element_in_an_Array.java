package leetcode.dsa.medium;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Q215_Kth_Largest_Element_in_an_Array {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();

        for(Integer num : nums) {
            priorityQueue.add(num);
            if(priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        return priorityQueue.poll();
    }
}
