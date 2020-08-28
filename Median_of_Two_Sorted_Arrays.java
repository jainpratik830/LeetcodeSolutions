public class Median_of_Two_Sorted_Arrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;

        if(m>n){
            int[] temp=nums1;
            nums1=nums2;
            nums2=temp;
            int t=m;
            m=n;
            n=t;
        }


        int halfLength= (m+n+1)/2;
        int leftMin= 0;
        int leftMax= m;

        while(leftMin<=leftMax ){

            int aCount= leftMin + (leftMax-leftMin)/2;
            int bCount= halfLength- aCount;

            if(aCount>0 && nums1[aCount-1]> nums2[bCount]){
                leftMax--;
            }else if(aCount<m && nums1[aCount]<nums2[bCount-1]){
                leftMin++;
            }else{


                int leftmed= (aCount==0)?nums2[bCount-1]: (bCount==0)? nums1[aCount-1]: Math.max(nums1[aCount-1],nums2[bCount-1]);

                if((m+n)%2==1){
                    return leftmed;
                }else{

                    int rightmed= (aCount==m)? nums2[bCount]: (bCount==n)? nums1[aCount]: Math.min(nums1[aCount],nums2[bCount]);

                    return (leftmed+rightmed)/2.0;
                }

            }


        }

        return 0.0;
    }

}
