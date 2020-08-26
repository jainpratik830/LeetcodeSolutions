import java.util.ArrayList;
import java.util.List;

public class Fizz_Buzz {

    public List<String> fizzBuzz(int n) {
        List<String> res=new ArrayList<>();
        if(n==0){
            return res;
        }

        for(int i=1;i<=n;i++){
            if(i%15==0){
                res.add("FizzBuzz");
            }else if(i%5==0){
                res.add("Buzz");
            }else if(i%3==0){
                res.add("Fizz");
            }else{
                res.add(""+i);
            }
        }

        return res;
    }

}
