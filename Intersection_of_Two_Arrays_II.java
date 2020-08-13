import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_of_Two_Arrays_II {

    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> l=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int x=0,y=0;
        while(x<nums1.length && y< nums2.length){
            if (nums1[x]==nums2[y]){
                l.add(nums1[x]);
                x++;
                y++;
            }else if(nums1[x]<nums2[y]){
                x++;
            }else{
                y++;
            }
        }

        int n=l.size();
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=l.get(i);
        }
        return res;
    }

}
