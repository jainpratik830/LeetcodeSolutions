public class Distribute_Candies_to_People {


    public int[] distributeCandies(int candies, int num_people) {
        int[] res=new int[num_people];
        if(candies==0){
            return res;
        }
        int count=0;

        int n=0;
        while(count<candies){
            for(int i=0;i<num_people;i++){

                if(count>=candies){
                    break;
                }
                if(count+n+i+1>candies){
                    res[i]+=candies-count;
                    count=candies;
                }else{
                    res[i]+=n+i+1;
                    count+=n+i+1;
                }


            }
            n+=num_people;

        }

        return res;
    }
}
