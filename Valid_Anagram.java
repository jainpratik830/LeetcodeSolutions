import java.util.Arrays;

public class Valid_Anagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() == 0 && t.length()==0){
            return true;
        }
        if(s.length() == 0 || t.length()==0){
            return false;
        }
        if(s.length() != t.length())
        {
            return false;
        }
        char[] s_arr= s.toCharArray();
        char[] t_arr= t.toCharArray();
        Arrays.sort(s_arr);
        Arrays.sort(t_arr);
        for(int i=0;i<s.length();i++){
            if(s_arr[i]!=t_arr[i]){
                return false;
            }
        }

        return true;
    }

}
