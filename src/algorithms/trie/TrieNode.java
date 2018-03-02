package algorithms.trie;

public class TrieNode {
    public boolean isWord;
    public TrieNode[] children;

    public TrieNode() {
        children = new TrieNode[26];
        for (int i=0; i < 26; i++){
            children[i] = null;
        }
        isWord = false;
    }
}
