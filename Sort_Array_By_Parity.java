public class Sort_Array_By_Parity {

    public int[] sortArrayByParity(int[] A) {
        if(A.length==0){
            return A;
        }
        int even=0,odd=A.length-1;
        while(even<odd){

            if(A[even]%2==0 && A[odd]%2==1){
                even++;
                odd--;
            }
            else if(A[even]%2==1 && A[odd]%2==1){
                odd--;
            }
            else if(A[even]%2==0 && A[odd]%2==0){
                even++;
            }else{
                int temp=A[even];
                A[even]=A[odd];
                A[odd]=temp;
                even++;
                odd--;
            }


        }

        return A;
    }

}
