public class Single_Number_II {

    public static void main(String[] args) {
        int[] nums={2,2,3,4,3,2,3};
        int one=0;
        int two=0;
        for(int n:nums){
            one= (one^n) & (~two);
            two=(two^n)&(~one);
        }

        System.out.println(one);
    }



}
