package leetcode.dsa.hard;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Q127_Word_LadderTest {

    @Test
    void ladderLength() {
        String startWord = "hit";
        String endWord = "cog";

        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
        Q127_Word_Ladder q127_word_ladder = new Q127_Word_Ladder();
        int result = q127_word_ladder.ladderLength(startWord, endWord, wordList);
        assertEquals(5, result);
    }

    @Test
    void getNeighbours() {
        String startWord = "hot";
        Set<String> wordList = new HashSet<>(Arrays.asList("hot","dot","dog","lot","log","cog"));
        Q127_Word_Ladder q127_word_ladder = new Q127_Word_Ladder();

        Set<String> neighbours = q127_word_ladder.getNeighbours(startWord, wordList);
        assertEquals(true, neighbours.contains("dot"));
        assertEquals(2, neighbours.size());
    }
    @Test
    void ladderLength2() {
        String startWord = "hot";
        String endWord = "dog";

        List<String> wordList = Arrays.asList("hot","cog","dog","tot","hog","hop","pot","dot");
        Q127_Word_Ladder q127_word_ladder = new Q127_Word_Ladder();
        int result = q127_word_ladder.ladderLength(startWord, endWord, wordList);
        assertEquals(3, result);
    }
    @Test
    void ladderLength3() {
        String startWord = "leet";
        String endWord = "code";

        List<String> wordList = Arrays.asList("lest","leet","lose","code","lode","robe","lost");
        Q127_Word_Ladder q127_word_ladder = new Q127_Word_Ladder();
        int result = q127_word_ladder.ladderLength(startWord, endWord, wordList);
        assertEquals(6, result);
    }
}