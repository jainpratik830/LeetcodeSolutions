import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers_With_Same_Consecutive_Differences {


    public static void main(String[] args) {

        int N=2;
        int K=1;



        List<Integer> curr= Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        for (int i=2;i<=N;i++){
            List<Integer> curr2=new ArrayList<>();
            for (int x:curr){
                int y= x%10;
                if (x>0 && K+y<10){
                    curr2.add(x*10+y+K);
                }
                if (x>0 && K >0 && y-K >=0){
                    curr2.add(x*10+y-K);
                }

            }
            curr=curr2;
        }

        curr.stream().mapToInt(j->j).toArray();

        System.out.println(curr);

    }

}
