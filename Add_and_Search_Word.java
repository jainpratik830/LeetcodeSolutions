public class Add_and_Search_Word {

    static class WordDictionary {

        static int ALPHABET_SIZE=26;

        static TrieNode root;

        public static class TrieNode{
            TrieNode[] children=new TrieNode[ALPHABET_SIZE];
            boolean isEndOfWord;

            TrieNode(){
                isEndOfWord = false;
                for (int i = 0; i < ALPHABET_SIZE; i++)
                    children[i] = null;
            }
        }

        /** Initialize your data structure here. */
        public WordDictionary() {
            root =new TrieNode();

        }

        /** Adds a word into the data structure. */
        public static void addWord(String word) {

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

        /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
        public static boolean search1(String word,TrieNode node) {

            int length=word.length();
//            if(length==0){
//                return true;
//            }
            TrieNode p=node;
            int index;
            String word1=word;
            for(int i=0;i<length;i++){
                if(word.charAt(i)!='.'){
                    index=word1.charAt(i)-'a';
                    if(p.children[index]==null){
                        return false;
                    }
                    p=p.children[index];
                }else{
                    // return (p!=null && search(word1.substring(i+1)));
                    boolean present=false;
                    for(int j=0;j<26;j++){
                        if(p.children[j]!= null){
                            present= search1(word1.substring(i+1),p.children[j]);
                        }
                        if(present){
                            return true;
                        }
                    }
                    if(!present){
                        return false;
                    }else{
                        return true;
                    }
                    // i++;
                }

            }
            return (p!= null && p.isEndOfWord);
        }


        public static boolean search(String word) {

            return search1(word,root);
        }

    }

    public static void main(String[] args) {
        WordDictionary obj = new WordDictionary();
        obj.addWord("bad");
        obj.addWord("dad");
        obj.addWord("mad");
        boolean param_2 = obj.search("b..");
        System.out.println(param_2);
    }


}
