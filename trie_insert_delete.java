class Trie {

    int ALPHABET_SIZE=26;


    class TrieNode
    {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

        // isEndOfWord is true if the node represents
        // end of a word
        boolean isEndOfWord;

        TrieNode(){
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    };
    TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {

        root=new TrieNode();
    }



    /** Inserts a word into the trie. */
    public void insert(String word) {

        int length=word.length();
        TrieNode p=root;
        int index;
        String word1=word;
        for(int i=0;i<length;i++){
            index=word1.charAt(i)-'a';
            if(p.children[index]==null){
                p.children[index]=new TrieNode();
            }
            p=p.children[index];

        }
        p.isEndOfWord=true;

    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {

        int length=word.length();
        TrieNode p=root;
        int index;

        for(int i=0;i<length;i++){
            index=word.charAt(i)-'a';
            if(p.children[index]==null){
                return false;
            }
            p=p.children[index];

        }

        return (p!= null && p.isEndOfWord);
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        int length=prefix.length();
        TrieNode p=root;
        int index;

        for(int i=0;i<length;i++){
            index=prefix.charAt(i)-'a';
            if(p.children[index]==null){
                return false;
            }
            p=p.children[index];

        }

        return p!= null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
