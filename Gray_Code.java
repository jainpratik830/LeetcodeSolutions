import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gray_Code {

    public List<Integer> grayCode(int n) {
        List<Integer> ans=new ArrayList<>();
        if(n==0){
            ans.add(0);
            return ans;
        }

        for(int i=0;i< 1<<n;i++){
            int x= i^ (i>>1);
            ans.add(x);
        }

        return ans;

    }
}
