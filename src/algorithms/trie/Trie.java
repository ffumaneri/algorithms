package algorithms.trie;

import java.util.ArrayList;
import java.util.List;

public class Trie {
    public TrieNode root;
    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        int charIndex;
        for (int i = 0; i < word.length(); i++){
            charIndex = word.charAt(i) - 'a';
            if (node.children[charIndex] == null) {
                node.children[charIndex] = new TrieNode();
            }
            node = node.children[charIndex];
        }
        node.isWord = true;
    }

    public void all(TrieNode node, List<String> foundWords, String prefix) {
        if (node == null) {
            return;
        }
        if (node.isWord){
            foundWords.add(prefix);
        }
        for (int i=0; i < 26; i++) {
            if (node.children[i] != null) {
                all(node.children[i], foundWords, prefix + (char)(i + 'a'));
            }
        }
    }
    public List<String> allChildren(TrieNode node) {
        List<String> result = new ArrayList<>();
        all(node, result, "");
        return result;
    }

}
