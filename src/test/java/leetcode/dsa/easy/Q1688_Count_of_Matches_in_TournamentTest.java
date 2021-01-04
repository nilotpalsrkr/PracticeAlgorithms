package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1688_Count_of_Matches_in_TournamentTest {

    @Test
    void numberOfMatches1() {
        Q1688_Count_of_Matches_in_Tournament q1688_count_of_matches_in_tournament = new Q1688_Count_of_Matches_in_Tournament();
        int number = 7;
        int result = q1688_count_of_matches_in_tournament.numberOfMatches(number);
        assertEquals(6, result);
    }


    @Test
    void numberOfMatches2() {
        Q1688_Count_of_Matches_in_Tournament q1688_count_of_matches_in_tournament = new Q1688_Count_of_Matches_in_Tournament();
        int number = 14;
        int result = q1688_count_of_matches_in_tournament.numberOfMatches(number);
        assertEquals(13, result);
    }
}