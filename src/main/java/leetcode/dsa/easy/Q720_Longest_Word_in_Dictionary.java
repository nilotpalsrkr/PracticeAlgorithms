package leetcode.dsa.easy;

import java.util.*;

public class Q720_Longest_Word_in_Dictionary {
    public String longestWord(String[] words) {
        Trie trie = new Trie(words);

        for(int i = 0; i<words.length; i++) {
            trie.insert(words[i], i+1); //indexed by 1
        }
        String result = trie.dfs();
        System.out.println(result);
        return result;
    }

}

class Node {
    Character c;
    Map<Character, Node> children = new HashMap<>();
    int index;

    public Node(Character c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Node{" +
                "c=" + c +
                ", children=" + children +
                ", index=" + index +
                '}';
    }
}

class Trie {
    Node root;
    String[] words;
    public Trie(String[] words) {
        root = new Node('0');
        this.words = words;
    }
    public void insert(String s, int index) {
        Node current = root;
        for(Character c : s.toCharArray()) {
            current.children.putIfAbsent(c, new Node(c));
            current = current.children.get(c);
        }
        current.index = index;
    }

    public String dfs() {
        String result = "";
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.empty()) {
            Node node = stack.pop();

            if(node.index > 0 || node == root) {
                if(node != root) {
                    result = result.length() > words[node.index-1].length() ? result : words[node.index-1];
                }
                node.children.forEach((k,v) -> stack.push(v));
            }


        }
    return result;
    }

}


