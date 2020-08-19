import java.util.*;
//import java.util.Comparator;

public class Non_overlapping_Intervals {


    public static void main(String[] args) {

        int[][] intervals={{1,2},{2,3},{3,4},{1,3}};
        if (intervals.length==0){
            return;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    return o2[1]-o1[1];
                }
                return o1[0]-o2[0];
            }
        });

        int end=intervals[0][1];
        int count=1;
        for (int i=1;i<intervals.length;i++){
            if (intervals[i][0]==end){
                end=intervals[i][1];
                count++;
            }
        }


        System.out.println(count);
    }

}
