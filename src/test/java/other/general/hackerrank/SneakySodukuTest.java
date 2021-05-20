package other.general.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SneakySodukuTest {

    @Test
    void isValidSudoku() {
        List<List<Integer>> array2D = Arrays.asList(Arrays.asList(2, 4, 2), Arrays.asList(76, 4, 8));
        boolean result = SneakySoduku.isValidSudoku(array2D);
        System.out.println(result);
    }
}