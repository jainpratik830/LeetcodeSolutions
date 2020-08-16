import java.util.Arrays;
import java.util.Scanner;

public class Compare_Strings_by_Frequency {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String a=scanner.next();
        String b=scanner.next();
        String[] first=a.split(",");
        String[] second=b.split(",");

//        System.out.println(Arrays.toString(first));
        int[] first_count=new int[first.length];
        int[] second_count=new int[first.length];
        for (int i=0;i<first.length;i++){
            char min='z';
            for (char j:first[i].toCharArray()){
                if (j<min){
                    min=j;
                }
            }
            for (char j:first[i].toCharArray()){
                if (j==min){
                    first_count[i]++;
                }
            }
        }
        for (int i=0;i<second.length;i++){
            char min='z';
            for (char j:second[i].toCharArray()){
                if (j<min){
                    min=j;
                }
            }
            for (char j:second[i].toCharArray()){
                if (j==min){
                    second_count[i]++;
                }
            }
        }
//        System.out.println(Arrays.toString(first_count));
        int[] ans=new int[second.length];
        for (int i=0;i<second.length;i++){
            for (int j=0;j<first.length;j++){
                if (second_count[i]>first_count[j]){
                    ans[i]++;
                }
            }
        }

//        System.out.println(Arrays.toString(ans));
    }

}
