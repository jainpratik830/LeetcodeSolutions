import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array {



    public static void main(String[] args) {

        int[] nums={0,0,1,1,1,2,2,3,3,4};

        int i=0;

        for(int j=1;j<nums.length;j++)
        {
            if(nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }

        }


        System.out.println(i+1);
    }

}
