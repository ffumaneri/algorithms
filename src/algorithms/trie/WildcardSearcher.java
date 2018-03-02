package algorithms.trie;

public class WildcardSearcher implements Searcher {
    TrieNode root;
    public WildcardSearcher(Trie trie) {
        this.root = trie.root;
    }
    @Override
    public String[] search(String word) {
        TrieNode node = root;

        for (int i=0; i < word.length(); i++){

        }

        return null;

    }
}
