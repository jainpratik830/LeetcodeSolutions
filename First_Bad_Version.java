public class First_Bad_Version {


    public boolean isBadVersion(int x){
        return true;
    }

    public int divide(int start,int end,int n){

        int mid= start + (end-start)/2;
        if(mid>=2 && isBadVersion(mid) && !isBadVersion(mid-1)){
            return mid;
        }if(mid==1 && isBadVersion(mid)){
            return mid;
        }
        if(isBadVersion(mid)){
            return divide(start,mid-1,n);
        }else{
            return divide(mid+1,end,n);
        }
    }

    public int firstBadVersion(int n) {
        if(n<=1 && isBadVersion(n)){
            return n;
        }

        return divide(1,n,n);
    }

}
