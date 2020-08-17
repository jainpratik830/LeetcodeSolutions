public class Happy_Strings {

    static int k=9;
    static int curr=0;

    public static void main(String[] args) {

        int count=0;
        printRes(count,"");


    }

    public static void printRes(int count,String res){

//        System.out.println(curr);

        if (count==3 ){
            curr++;
            if ( curr==k)
                System.out.println(res);

            return;
        }

        if (count==0){
            printRes(count+1,"a");
            printRes(count+1,"b");
            printRes(count+1,"c");
        }else {
            if (res.charAt(count-1)=='a'){
                printRes(count+1,res+"b");
                printRes(count+1,res+"c");
            }else if (res.charAt(count-1)=='b'){
                printRes(count+1,res+"a");
                printRes(count+1,res+"c");
            }else {
                printRes(count+1,res+"a");
                printRes(count+1,res+"b");
            }
        }


    }

}
