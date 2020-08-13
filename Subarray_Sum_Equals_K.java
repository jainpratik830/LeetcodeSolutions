import java.util.HashMap;
import java.util.Map;

public class Subarray_Sum_Equals_K {

    public static void main(String[] args) {
        int[] nums={1};
        int k=0;

        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];


            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

//        System.out.println(map.values());
        System.out.println(count);
    }

}
