package algorithms.trie;

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

    public boolean search(String word) {
        TrieNode node = root;

        for (int i=0; i < word.length(); i++){
            int charIndex = word.charAt(i) - 'a';
            if (node.children[charIndex] != null){
                node = node.children[charIndex];
            } else {
                return false;
            }
        }

        return node.isWord;
    }

}
