import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gray_Code {

    public static void allPossible(int[] arr,int length, int current, ArrayList<int[]> res){

        if (length==current){
                res.add(arr.clone());
//                resadd(arr.clone());

            return;
        }


        arr[current] = 0;
        allPossible(arr,length,current+1,res);

        arr[current] = 1;
//        s+=characters.charAt(index);
        allPossible(arr,length,current+1,res);
        arr[current]=0;

    }

    public static boolean isOne(int[] a,int[] b){

        int count=0;
        for(int i=0;i<a.length;i++){
            if (a[i]!=b[i]){
                count++;
            }
            if (count>1){
                return false;
            }
        }

        if (count==1){
            return true;
        }
        return false;

    }




    public static void main(String[] args) {

        int n=10;
        ArrayList<int[]> result=new ArrayList<>();
        int[] arr=new int[n];
        allPossible(arr,n,0,result);
        int[] two_power=new int[n];
        two_power[0]=1;
        for (int i=1;i<n;i++){
            two_power[i]=2*two_power[i-1];
        }


        List<Integer> ans=new ArrayList<>();
        int x=result.size();
        int curr_index=0;

        while (ans.size()!=x){
            int[] a=result.get(curr_index);
            System.out.println(Arrays.toString(a));
            int q=0;
            for (int i=0;i<n;i++){
                q+=a[i]*two_power[i];
            }

            ans.add(q);
            result.remove(a);
            for (int i=0;i<result.size();i++){
                if (isOne(a,result.get(i))){
                    curr_index=i;
                    break;
                }
            }

        }

//        for (int i=0;i<x;i++){
//            System.out.println((ans.get(i)));
//        }

    }
}
