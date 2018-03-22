package algorithms.trie;

public class BasicSearcher implements Searcher {
    private TrieNode root;

    public BasicSearcher(Trie trie) {
        this.root = trie.root;
    }

    @Override
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
