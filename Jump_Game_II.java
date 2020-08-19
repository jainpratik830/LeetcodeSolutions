public class Jump_Game_II {

    public int jump(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int count=1;
        int i=1;
        int right=nums[0];
        int max=nums[0];
        int index=nums[0];
        while(i<nums.length-1){
            if(i+nums[i]>max){
                max=Math.max(max,i+nums[i]);
                index=i;
            }

            if(i==right){
                count++;
                right=max;
                i=index;
            }else{
                i++;
            }
        }

        return count;
    }

}
