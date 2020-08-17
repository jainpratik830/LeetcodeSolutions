import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Binary_Watch {

    public static void allPossible(int[] arr,int length, int current, int count, int curr_count, ArrayList<int[]> res){

        if (length==current){
            if (count==curr_count) {
                res.add(arr.clone());
//                resadd(arr.clone());
            }
            return;
        }

        if (count==curr_count){
            res.add(arr.clone());
           return;
        }

        arr[current] = 0;
        allPossible(arr,length,current+1,count,curr_count,res);

        arr[current] = 1;
//        s+=characters.charAt(index);
        allPossible(arr,length,current+1,count,curr_count+1,res);
        arr[current]=0;

    }

    public static String convert(int[] arr){

        String s;
        int n=1;
        int sum_hour=0;
        int sum_minute=0;
        for (int i=3;i>=0;i--){
            sum_hour+=arr[i]*n;
            n*=2;
        }
        n=1;
        for (int i=9;i>=4;i--){
            sum_minute+=arr[i]*n;
            n*=2;
        }

        if(sum_hour>=12 || sum_minute>=60){
            return "";
        }
        if (sum_minute<10){
            s=sum_hour+":0"+sum_minute;
        }else {
            s=sum_hour+":"+sum_minute;
        }
//        if (sum_minute)

        return s;

    }


    public static void main(String[] args) {
        ArrayList<int[]> res=new ArrayList<>();
        int length=10;
        int[] arr=new int[10];
        allPossible(arr,10,0,1,0,res);
//        S
        List<String> result=new ArrayList<>();
        for (int i=0;i<res.size();i++){
            String a=convert(res.get(i));
            if(a!=""){
                result.add(a);
            }
        }


        System.out.println(result);
    }
}
