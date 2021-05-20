package other.general.trie;

import java.util.HashMap;

public class TrieOperations {
    Trie root;
    int index = 0;

    public Trie add(String pattern) {
        Trie currentPointer = root;
        Trie nextTriePointer = currentPointer;
        if(currentPointer == null && pattern != null) {
            try {
                Character character = pattern.charAt(0);
                HashMap hashMap = new HashMap();
                currentPointer = new Trie(index++, hashMap);
                nextTriePointer  = new Trie(index++);
                System.out.println(currentPointer.element+"->"+nextTriePointer.element+":"+character);
                hashMap.put(character, nextTriePointer);
                pattern = pattern.substring(1);
                root = currentPointer;
            }catch (IndexOutOfBoundsException e) {
                return root;
            }
        }

        while(!pattern.isEmpty()) {
            try {
                Character character = pattern.charAt(0);
                currentPointer = isCharecterEdgePresentInCurrentNode(nextTriePointer, character);
                HashMap hashMap = new HashMap();
                nextTriePointer = new Trie(index++);
                System.out.println(currentPointer.element + "->" + nextTriePointer.element + ":" + character);
                hashMap.put(character, nextTriePointer);
                currentPointer.setNext(hashMap);
                pattern = pattern.substring(1);
                //currentPointer = nextTriePointer;

            }catch (IndexOutOfBoundsException e) {
                return root;
            }
        }
        return root;

    }

    private Trie isCharecterEdgePresentInCurrentNode(Trie root, Character character) {
        if(root == null) return root;
        else if(root.getNext()!=null && root.getNext().containsKey(character)) {
            return root.getNext().get(character);
        }
        else return root;
    }


}
