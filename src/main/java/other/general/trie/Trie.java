package other.general.trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {
    Integer element;
    Map<Character, Trie> next;

    public Trie(Integer element) {
        this.element = element;
        this.next = null;
    }

    public Trie(Integer element, Map<Character, Trie> next) {
        this.element = element;
        this.next = next;
    }

    public Integer getElement() {
        return element;
    }

    public void setElement(Integer element) {
        this.element = element;
    }

    public Map<Character, Trie> getNext() {
        return next;
    }

    public void setNext(Map<Character, Trie> next) {
        this.next = next;
    }

    public Trie contains(Character element) {
        return next.getOrDefault(element, null);
    }
}
