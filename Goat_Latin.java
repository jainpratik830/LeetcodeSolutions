import java.util.HashMap;

public class Goat_Latin {

    public String toGoatLatin(String S) {

        HashMap<Character,Integer> map=new HashMap<>();

        String  maa="maa";
        String result="";
        String[] words=S.split(" ");
        for (String word:words){
            if(!result.equals("")){
                result+=" ";
            }
            char ch =Character.toLowerCase(word.charAt(0)) ;
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                result+=word+maa;
            }else{
                result+= word.substring(1)+word.charAt(0)+maa;
            }
            maa+="a";
        }

        return result;
    }

}
