import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pascals_Triangle_II {

    public static void main(String[] args) {

        int k=3;
        int[] prev=new int[k+1];
        int[] curr=new int[k+1];

        prev[0]=1;
        for(int i=1;i<=k;i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    curr[j] = prev[j];
                } else {

                    curr[j] = prev[j] + prev[j - 1];
//                    System.out.println("here "+ curr[j]);
                }
            }
//            System.out.println(Arrays.toString(curr));
            prev= curr.clone();
        }

//        List<Integer> l  ist=(List<Integer>) Arrays.asList(curr);
        List<Integer> list=new ArrayList<>();
        for (int x:curr){
            list.add(x);
        }
        System.out.println(list);



    }

}
