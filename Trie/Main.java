public class Main {
    public static void main(String[] args) {
        Trie1 newTrie=new Trie1();
        newTrie.insert("API");
        newTrie.insert("APIS");
        newTrie.delete("API");
        newTrie.search("API");
    }
}
