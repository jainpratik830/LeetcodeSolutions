public class Merge_Sorted_Array {

    public void shift(int[] a,int i){

        for(int t=a.length-1;t>i;t--){
            a[t]=a[t-1];
        }

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=m;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                i++;
            }else{
                shift(nums1,i);
                nums1[i]=nums2[j];
                m++;
                j++;
            }
        }

        while(j<n){
            nums1[i++]=nums2[j];
            j++;
        }
    }

}
