public class Substring_Without_Repeating_Characters {

    public static int lengthOfLongestSubstring(String s) {
        int[] count=new int[256];
        // s= s.replaceAll("[ ]+","");
        if (s==null|| s.length()==0){
            return 0;
        }

        int slow=0,fast=0;
        int max=-1;
        while(fast!=s.length()){
            int x=(int) s.charAt(fast);
            count[x]++;
            if(count[x]>1){

                int y=(int) s.charAt(slow);
                while(y!=x){
                    count[y]--;
                    slow++;
                    y= (int) s.charAt(slow);

                }
                if(y==x){
                    count[y]--;
                    slow++;
                }

            }
//            System.out.println(fast+" "+slow);
            max=Math.max(max,fast-slow+1);
            fast++;
        }

        return max;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" "));

    }

}
