public class Plus_One {


    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        if(digits[n]!=9){
            digits[n]++;
            return digits;
        }else{

            while(digits[n]==9){
                digits[n]=0;
                n--;
                if(n==-1){
                    break;
                }
            }

            if(n>=0){
                digits[n]++;
                return digits;
            }

            int[] x=new int[digits.length+1];
            x[0]=1;
            return x;

        }
    }

}
