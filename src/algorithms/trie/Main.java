package algorithms.trie;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        System.out.println("Insert bed");
        trie.insert("bed");
        System.out.println("Insert house");
        trie.insert("house");
        System.out.println("Insert bedtime");
        trie.insert("bedtime");

        System.out.println("All words:");
        trie.allChildren(trie.root).stream().forEach(s -> System.out.println(s));

        System.out.println("Find prefix bed");
        PrefixFinder pf = new PrefixFinder(trie);
        pf.find("bed").stream().forEach(s -> System.out.println(s));

        System.out.println("Search house: " + trie.search("house"));
        System.out.println("Search dog: " + trie.search("dog"));


        RecursiveSearcher wsearcher = new RecursiveSearcher(trie);
        System.out.println("Search house: " + wsearcher.search("house"));
        System.out.println("Search dog: " + wsearcher.search("dog"));
    }
}
