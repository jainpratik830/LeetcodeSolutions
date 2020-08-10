public class Rotate_Array {

    public void reverse(int[] nums,int i,int j){

        if(i>=j || i>=nums.length || j>=nums.length){
            return;
        }

        for(int k=i;k<=i+(j-i)/2;k++){
            int temp=nums[k];
            nums[k]=nums[j-k+i];
            nums[j-k+i]=temp;
        }

    }

    public void rotate(int[] nums, int k) {

        if(nums.length==0 ){
            return;
        }
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

    }

}
