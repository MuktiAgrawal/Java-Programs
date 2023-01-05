public class Trie1 {
    private TrieNode root;
    public Trie1(){
        root=new TrieNode();
        System.out.println("The Trie has been created");
    }
    // Insertion
    public void insert(String word){
        TrieNode current=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            TrieNode node=current.children.get(ch);
            if(node==null){
                node=new TrieNode();
                current.children.put(ch,node);
            }
            current=node;
        }
        current.endOfString=true;
        System.out.println("Successfully inserted "+word+" in Trie");
    }
    // Search for a word in Trie
    public boolean search(String word){
        TrieNode current=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            TrieNode node=current.children.get(ch);
            if(node==null){
                System.out.println("The word "+word+" does not exist in Trie");
                return false;
            }
            current=node;
        }
        if(current.endOfString){
            System.out.println("The word "+word+" exists in Trie");
            return true;
        }
        else{
            System.out.println("The word "+word+" does not exist in Trie. But it is a prefix of another string.");
        }
        return current.endOfString;
    }

    private boolean delete(TrieNode parentNode,String word,int index){
        char ch=word.charAt(index);
        TrieNode currentNode=parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;
        if(currentNode.children.size()>1){ // if current word prefix is serving as a prefix for another word example: API and APPLE
            delete(currentNode, word, index+1);
            return false;
        }
        if(index==word.length()-1){
            if(currentNode.children.size()>=1){ // Example AP(word) and API
                currentNode.endOfString=false;
                return false;
            }
            else{
                parentNode.children.remove(ch); // Example AP and API(word to be deleted)
                return true;
            }
        }
        if(currentNode.endOfString==true){ // Trie=AP,API(to be deleted) and we are checking for character P
            delete(currentNode, word, index+1);
            return false;
        }
        canThisNodeBeDeleted=delete(currentNode,word,index+1);
        if(canThisNodeBeDeleted==true){
            parentNode.children.remove(ch);
            return true;
        }
        else{
            return false;
        }
    }

    public void delete(String word){
        if(search(word)==true){
            delete(root,word,0);
        }
    }
}
