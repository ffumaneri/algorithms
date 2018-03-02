package algorithms.trie;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("bed");
        trie.insert("house");

        System.out.println("Search house: " + trie.search("house"));
        System.out.println("Search dog: " + trie.search("dog"));
    }
}
