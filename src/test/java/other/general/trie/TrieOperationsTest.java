package other.general.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieOperationsTest {

    @Test
    void add() {
        String string = "ATA";
        TrieOperations trieOperations = new TrieOperations();
        Trie trie = trieOperations.add(string);

    }
    @Test
    void add2() {

        TrieOperations trieOperations = new TrieOperations();
        trieOperations.add("AT");
        trieOperations.add("AG");
        trieOperations.add("AC");



    }
}