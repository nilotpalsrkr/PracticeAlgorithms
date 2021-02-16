package coursera.compettive_programming_for_beginners.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheHopperProblemTest {

    @Test
    void hopToFindMaxValue1() {
        int[] arr = {1,3,2,-2,6};
        TheHopperProblem theHopperProblem = new TheHopperProblem();
        int result = theHopperProblem.hopToFindMaxValueWithNoDp0(arr);
        assertEquals(12, result);
    }
    @Test
    void hopToFindMaxValue2() {
        int[] arr = {1};
        TheHopperProblem theHopperProblem = new TheHopperProblem();
        int result = theHopperProblem.hopToFindMaxValue(arr);
        assertEquals(1, result);
    }
    @Test
    void hopToFindMaxValue3() {
        int[] arr = {1,-1};
        TheHopperProblem theHopperProblem = new TheHopperProblem();
        int result = theHopperProblem.hopToFindMaxValue(arr);
        assertEquals(0, result);
    }
    @Test
    void hopToFindMaxValue4() {
        int[] arr = {-1,0,1};
        TheHopperProblem theHopperProblem = new TheHopperProblem();
        int result = theHopperProblem.hopToFindMaxValue(arr);
        assertEquals(1, result);
    }
    @Test
    void hopToFindMaxValue5() {
        int[] arr = {-1,-1,1};
        TheHopperProblem theHopperProblem = new TheHopperProblem();
        int result = theHopperProblem.hopToFindMaxValue(arr);
        assertEquals(0, result);
    }
    @Test
    void hopToFindMaxValue6() {
        int[] arr = {};
        TheHopperProblem theHopperProblem = new TheHopperProblem();
        int result = theHopperProblem.hopToFindMaxValue(arr);
        assertEquals(0, result);
    }
}