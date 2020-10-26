package other.general;

import com.sun.tools.javac.util.ArrayUtils;
import com.sun.xml.internal.bind.v2.model.util.ArrayInfoUtil;
import org.junit.jupiter.api.Test;
import sun.security.util.ArrayUtil;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class AllElementGreaterThanXIsOnLeftTest {

    @Test
    void randomElements() {
        int[] arr = {2,3,4,5,8,4};
        AllElementGreaterThanXIsOnLeft allElementGreaterThanXIsOnLeft = new AllElementGreaterThanXIsOnLeft();
        allElementGreaterThanXIsOnLeft.allElementGreaterThanXIsOnLeft(arr, 3);
        assertEquals(5, Arrays.binarySearch(arr, 8));
    }
    @Test
    void allEqual() {
        int[] arr = {1,1,1,1,1};
        AllElementGreaterThanXIsOnLeft allElementGreaterThanXIsOnLeft = new AllElementGreaterThanXIsOnLeft();
        allElementGreaterThanXIsOnLeft.allElementGreaterThanXIsOnLeft(arr, 3);
        assertEquals(arr[4], 1);
    }
    @Test
    void sortedDecending() {
        int[] arr = {9,8,7,6,5,4};
        AllElementGreaterThanXIsOnLeft allElementGreaterThanXIsOnLeft = new AllElementGreaterThanXIsOnLeft();
        allElementGreaterThanXIsOnLeft.allElementGreaterThanXIsOnLeft(arr, 3);
        assertTrue( elementPresentAt(arr, 7)> elementPresentAt(arr, 6) );
    }

    private int elementPresentAt(int[] arr, int element) {
        return IntStream.rangeClosed(0, arr.length-1).filter(i -> element == arr[i]).findFirst().orElse(-1);
    }

}