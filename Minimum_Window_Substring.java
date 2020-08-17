import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Minimum_Window_Substring {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String s=scanner.next();
        String t=scanner.next();
        if (s==null || t==null){
            return;
        }

        if (s.length()==0 || t.length()==0){
            return;
        }

        HashMap<Character,Integer> needed=new HashMap<>();
        HashMap<Character,Integer> present=new HashMap<>();
        int missing_count=0;
        for (Character a:t.toCharArray()){
            if (needed.containsKey(a)){
                needed.put(a,needed.get(a)+1);
            }else {
                needed.put(a,1);
                present.put(a,0);
                missing_count++;
            }
        }

        int slow=0,fast=0;
        int[] result={-1,0,0};

        while (fast<s.length()){

            char currFast=s.charAt(fast);

            if (needed.containsKey(currFast)){

                present.put(currFast,present.get(currFast)+1);
                if (needed.get(currFast)==present.get(currFast)){
                    missing_count--;
//                    System.out.println("hee");
                }
            }

            while (missing_count==0){
                if ((result[0]==-1) || (result[2]-result[1]>fast-slow)){
                    result[0]=fast-slow+1;
                    result[1]=slow;
                    result[2]=fast+1;
                }

                char currSlow=s.charAt(slow);
                if (needed.containsKey(currSlow)){
                    present.put(currSlow,present.get(currSlow)-1);
                    if (needed.get(currSlow)>present.get(currSlow)){
                        missing_count++;
                    }
                }

                slow++;

            }

            fast++;
//            System.out.println(result[1]+" "+result[2]);
        }

//        System.out.println(minWindow(s,t));

    }

}
