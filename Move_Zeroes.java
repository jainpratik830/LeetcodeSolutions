public class Move_Zeroes {

    public void moveZeroes(int[] nums) {

        int j=0,zero=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero=i;
                break;
            }
        }
        if(zero==-1){
            return;
        }
        int i=zero+1;

        while(i<nums.length){
            if(nums[i]!=0){
                nums[zero]=nums[i];
                nums[i]=0;
                for(int k=zero+1;k<nums.length;k++){
                    if(nums[k]==0){
                        zero=k;
                        i=zero+1;
                        break;
                    }
                }
            }else{
                i++;
            }
        }

    }
}
