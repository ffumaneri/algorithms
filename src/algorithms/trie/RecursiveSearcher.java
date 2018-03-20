package algorithms.trie;

public class RecursiveSearcher implements Searcher {
    TrieNode root;
    public RecursiveSearcher(Trie trie) {
        this.root = trie.root;
    }

    @Override
    public boolean search(String word) {
        TrieNode node = root;
        return search(word, node, 0);
    }

    private boolean search(String word, TrieNode node, int index) {
        if (index == word.length()) {
            return node.isWord;
        } else {
            int charIndex = word.charAt(index) - 'a';
            if (node.children[charIndex] != null){
                return search(word, node.children[charIndex], index + 1);
            } else {
                return false;
            }
        }
    }

}
