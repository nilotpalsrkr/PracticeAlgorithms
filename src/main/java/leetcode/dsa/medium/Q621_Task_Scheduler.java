package leetcode.dsa.medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//8123 645 007
public class Q621_Task_Scheduler {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        MyPriorityQueue maxHeap = new MyPriorityQueue(tasks.length, new PairComparator());
        int macCount = -1;
        for(Character c : tasks) {
            Integer count = map.get(c);
            if(count == null) {
                count = 1;
            }
            else  count++;
            map.put(c, count);

            macCount = Math.max(macCount, count);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            maxHeap.add(new PairX(entry.getKey(), entry.getValue()));
        }
        maxHeap.getNextElement();
        return 0;
    }

}

class PairComparator implements Comparator<PairX> {

    @Override
    public int compare(PairX o1, PairX o2) {
        if(o1.count < o2.count) return 1;
        else if(o1.count > o2.count) return  -1;
        else return 0;
    }
}
class PairX {
    public Character c;
    public Integer count;
    public PairX(Character c, Integer count){
        this.count = count;
        this.c = c;
    }
}
class MyPriorityQueue extends PriorityQueue<PairX> {
    int n;
    int counter;
    Map<Character, Integer> mapCharecterCounter = new HashMap<>();

    public MyPriorityQueue(int length, PairComparator pairComparator) {
        super(length, pairComparator);
        counter = 0;
    }

    public Character getNextElement() {
        PairX pairX =  super.poll();
        Integer charecterCounter = mapCharecterCounter.getOrDefault(pairX.c, 0);
        while(!(counter - charecterCounter < n)) {
            pairX = poll();
            super.add(pairX);
            charecterCounter = mapCharecterCounter.get(pairX.c);
        }
        counter++;
        charecterCounter = counter;
        pairX.count--;
        if(pairX.count > 0) super.add(pairX);
        return pairX.c;
    }
}
