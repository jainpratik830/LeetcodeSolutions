public class Find_the_Duplicate_Number {

    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};

        int slow=0;
        int fast=0;
        while(true){
            slow=nums[slow];
            fast=nums[nums[fast]];
            if(slow==fast){
                break;
            }
        }

        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }

        System.out.println(slow);
    }

}
