import java.util.Scanner;

public class Maximum_Time {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a=scanner.next();
        a= a.replace("\"","");
//        System.out.println(a);
        String[] time=a.split(":");
        String result="";
        if (time[1].charAt(1)=='?'){
            result="9";
        }else {
            result=time[1].charAt(1)+result;
        }
        if (time[1].charAt(0)=='?'){
            result="5"+result;
        }else {
            result= time[1].charAt(0)+result;
        }

        if (time[0].charAt(0)=='?' && time[0].charAt(1)=='?'){
            result= "23:"+result;
        }else if (time[0].charAt(0)!='?' && time[0].charAt(1)=='?'){
            if (time[0].charAt(0)=='0' || time[0].charAt(0)=='1'){
                result = time[0].charAt(0)+"9:"+result;
            }else {
                result = time[0].charAt(0)+"3:"+result;
            }
        }else if (time[0].charAt(0)=='?' && time[0].charAt(1)!='?'){
            if (time[0].charAt(1)>='0' && time[0].charAt(1)<='3'){
                result ="2"+ time[0].charAt(1)+":"+result;
            }else {
                result = "1"+ time[0].charAt(1)+":"+result;
            }
        }else {
            result= time[0]+":"+result;
        }

        System.out.println(result);
    }

}
