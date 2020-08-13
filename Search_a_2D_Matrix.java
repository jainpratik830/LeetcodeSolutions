import java.util.Arrays;

public class Search_a_2D_Matrix {


    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0 ) {
            return false;
        }
        int j=matrix[0].length-1;
        int i=0;
        while(i<matrix.length){
            if(matrix[i][j]<target){
                i++;
            }else{
                if(Arrays.binarySearch(matrix[i],target)>=0){
                    return true;
                }
                return false;
            }
        }

        return false;
    }
}
