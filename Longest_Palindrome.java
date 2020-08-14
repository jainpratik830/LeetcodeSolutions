import java.util.HashMap;
import java.util.Map;

public class Longest_Palindrome {

    public int longestPalindrome(String s) {

        if(s.length()<=1){
            return s.length();
        }

        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        int count=0;
        boolean odd=false;

        for(char c:map.keySet()){
            int x=map.get(c);
            if(x%2==0){
                count+=x;
                continue;
            }
            if(x%2==1 && !odd ){
                count+=x;
                odd=true;
                continue;
            }
            if(x%2==1 && odd ){
                count+=x-1;
                // odd=true;
                continue;
            }

        }
        return count;
    }

}
