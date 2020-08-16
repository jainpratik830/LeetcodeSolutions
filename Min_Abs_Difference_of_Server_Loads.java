public class Min_Abs_Difference_of_Server_Loads {

    public static int minSum(int[] n,int sum,int index){
        if (index==n.length){
            if (sum>=0)
                return sum;
            else {
                return Integer.MAX_VALUE;
            }
        }

        return Math.min(minSum(n,sum+n[index],index+1),minSum(n,sum-n[index],index+1));
    }

    public static void main(String[] args) {
        int[] stones={21,16,23,32,25,13,20,18,22,21,84,35,33,17,27,24,10,19,31,26,94,37,31,25,24,25,15,23,17,13};
        int x=7;
        System.out.println(minSum(stones,0,0));
    }

}
