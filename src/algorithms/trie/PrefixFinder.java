package algorithms.trie;

import java.util.ArrayList;
import java.util.List;

public class PrefixFinder implements Finder{

    private Trie trie;

    public PrefixFinder(Trie trie) {
        this.trie = trie;
    }

    private TrieNode findPrefixNode(TrieNode node, String prefix) {
        for (int i=0; i < prefix.length(); i++) {
            int charIndex = prefix.charAt(i) - 'a';
            if (node.children[charIndex] != null) {
                node = node.children[charIndex];
            } else {
                return null;
            }
        }
        return node;
    }

    @Override
    public List<String> find(String value) {
        TrieNode node = findPrefixNode(trie.root, value);
        List<String> result = new ArrayList<>();
        if (node != null) {
            trie.all(node, result, value);
        }
        return result;
    }
}
