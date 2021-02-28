package leetcode.dsa.medium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Q56_Merge_Intervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        LinkedList<Pair> result = new LinkedList<>();

        for(int[] arr : intervals) {
            Pair pair = new Pair(arr[0], arr[1]);
            if(result.isEmpty()) {
                result.add(pair);
            }
            else {
                Pair lastPairFromResult = result.getLast();
                if(lastPairFromResult.contains(pair)) {
                    result.removeLast();
                    Pair newMergedPair = new Pair(lastPairFromResult.start, Math.max(lastPairFromResult.end, pair.end));
                    result.add(newMergedPair);
                }
                else {
                    result.add(pair);
                }
            }
        }

    return Pair.convert(result);

    }

}

class Pair {
    public int start;
    public int end;
    public Pair(int start, int end) {
        this.start = start;
        this.end = end;
    }
    public boolean contains(Pair pair) {
        return this.end >= pair.start;
    }
    //https://stackoverflow.com/questions/66405188/how-to-collect-a-2d-array-in-java-8-from-a-list-of-objects/66405222#66405222
    public static int[][] convert(List<Pair> listOfPair) {

        List list = listOfPair.stream().map(x -> new int[]{x.start,
                x.end}).collect(Collectors.toList());
        return listOfPair.stream().map(x -> new int[]{x.start,
                x.end}).collect(Collectors.toList()).toArray(new int[0][0]);
    }
}
