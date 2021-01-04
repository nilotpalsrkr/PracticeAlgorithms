package leetcode.dsa.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1288_Remove_Covered_Intervals {
    public int removeCoveredIntervals(int[][] intervals) {
        List<Interval> list = new ArrayList<>();
        for(int[] interval : intervals) {
            list.add(new Interval(interval));
        }
        int c = 0;
        Collections.sort(list, Collections.reverseOrder());
        Interval firstInterval = null , secondInterval;
        if(list.size() >0) { firstInterval = list.get(0); c++; }
        for(int i = 1; i< list.size() ; i++) {
            secondInterval = list.get(i);
            if(!firstInterval.covers(secondInterval)) {
                c++;
                firstInterval = secondInterval;
            }
        }
        if(list.size() == 1) c++;
        return c;
    }
}
class Interval implements Comparable{
    int x;
    int y;

    public Interval(int[] arr) {
        this.x = arr[0];
        this.y = arr[1];
    }

    @Override
    public int compareTo(Object o) {
        if(this.x < ((Interval)o).x) return 1;
        if(this.x > ((Interval)o).x) return -1;

        else  {
            if(this.y > ((Interval)o).y) return 1;
            else if(this.y < ((Interval)o).y) return -1;
            else return 0;
        }
    }

    @Override
    public String toString() {
        return "Interval{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    boolean covers(Interval interval) {
        if(this.x <= interval.x && this.y >= interval.y ) {
            return true;
        }
        else return false;
    }
}
