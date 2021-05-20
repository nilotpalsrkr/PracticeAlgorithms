package other.general.hackerrank;

import java.util.*;

public class SneakySoduku {
    static boolean isValidSudoku(List<List<Integer>> puzzle) {

       for(int row =0; row < puzzle.size() ; row++) {
           List<Integer> colValues = new ArrayList<>();
           for(int col = 0; col < puzzle.get(row).size() ; col++) {
               colValues.add(puzzle.get(row).get(col));
           }
           if(!isCommonDivisorPresent(colValues) && !isCommonDivisorPresent(puzzle.get(row))) return false;
       }
        return true;
    }

    private static boolean isCommonDivisorPresent(List<Integer> numbers) {
        int max = numbers.stream().max(Comparator.naturalOrder()).get();
        boolean hasCommonDivisor = false;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i< numbers.size(); i++) {
            for (int j = 2; j <= Math.min(max, numbers.get(i)); j++) {
                if (numbers.get(i) % j == 0  && i == 0){
                    set.add(j);
                }else {
                hasCommonDivisor = hasCommonDivisor || set.contains(j);
                }

            }
            if(!hasCommonDivisor) return false;


        }
        return hasCommonDivisor;
    }
}
