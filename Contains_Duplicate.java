import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate {

    public static boolean containsDuplicate(int[] nums) {
        if(nums.length<=1){
            return false;
        }

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);

            }else{
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] a={1,2,3,4,5,6};
        System.out.println(containsDuplicate(a));

    }
}
