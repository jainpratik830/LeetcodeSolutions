import java.util.Arrays;

public class Search_a_2D_Matrix_II {

    public boolean searchMatrix(int[][] matrix, int target) {


        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int i=0,j=matrix[0].length-1;
        while(i<matrix.length && j>=0){

            if(matrix[i][j]==target){
                return true;
            }
            if(matrix[i][j]>target){
                j--;
            }else{
                i++;
            }

        }

        return false;

    }

}
