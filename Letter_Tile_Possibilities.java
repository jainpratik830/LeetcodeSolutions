public class Letter_Tile_Possibilities {
    static int count=0;

    public static void main(String[] args) {

        String tiles="AAB";
        int[] freq=new int[26];
        for (char c:tiles.toCharArray()){
            freq[c-'A']++;
        }
        printRes(freq,"");


    }

    public static void printRes(int[] freq,String res){

//        System.out.println(res);
        count++;

        for (int i=0;i<26;i++){
            if (freq[i]!=0){
                freq[i]--;
                printRes(freq,res+(char)(freq[i]+'A'));
                freq[i]++;
            }
        }

    }

}
