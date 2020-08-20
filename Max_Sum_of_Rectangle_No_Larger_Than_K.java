public class Max_Sum_of_Rectangle_No_Larger_Than_K {

    public int maxSumSubmatrix(int[][] matrix, int k) {
        int m=matrix.length;
        int n=matrix[0].length;

        int rowStart=0,rowEnd=0,colStart=0,colEnd=0;
        int left=0,right=0;
        int res=Integer.MIN_VALUE;

        for(left=0;left<n;left++){
            int[] temp=new int[m];
            for(right=left;right<n;right++){
                for(int i=0;i<m;i++){
                    temp[i]+=matrix[i][right];
                }

                int curr = 0;
                int max = temp[0];
                for (int x : temp) {
                    curr = Math.max(x, curr + x);
                    max = Math.max(curr, max);
                    if (max == k) return max;
                }
                if (max < k) {
                    res = Math.max(max, res);
                } else {
                    for (int a = 0; a < m; a++) {
                        int currSum = 0;
                        for (int b = a; b < m; b++) {
                            currSum += temp[b];
                            if (currSum <= k) res = Math.max(currSum, res);
                        }
                    }
                    if (res == k) return res;
                }
            }
        }

        return res;
    }

}
