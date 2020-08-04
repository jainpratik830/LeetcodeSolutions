public class isPowerOfFour {

    public boolean isPowerOfFour(int num) {
        if(num==1){
            return true;
        }
        String a= Integer.toBinaryString(num);
        int n=a.length();
        if(n%2==0){
            return false;
        }
        if(a.charAt(0)=='1' && Integer.parseInt(a.substring(1), 2)==0){
            return true;
        }

        return false;
    }

}
