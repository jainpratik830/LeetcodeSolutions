public class Sudoku {

    public static boolean isSafe(char[][] board,int row,int col,char num){
        for (int i=0;i<board[row].length;i++){
            if (board[row][i]== num){
                return false;
            }
        }
        for (int i=0;i<board.length;i++){
            if (board[i][col]== num){
                return false;
            }
        }
//        int sqrt = 3;
        int r = row/3;
        int c = col/3;
        for (int i=r*3;i<r*3+3;i++){
            for (int j=c*3;j<c*3+3;j++){
                if (board[i][j]==num){
                    return false;
                }
            }
        }


        return true;
    }


    public static boolean solve(char[][] board){

        int row=-1;
        int col=-1;
        boolean isSolved=true;
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if (board[i][j] == '.') {
                    row=i;
                    col=j;
                    isSolved=false;
                    break;
                }
            }
            if (!isSolved){
                break;
            }
        }
        if (isSolved){
            return true;
        }

//        for ()
        for (int i=1;i<=9;i++){
            if (isSafe(board,row,col,(char)(i+'0'))){
                board[row][col]=(char)(i+'0');
                if (solve(board)){
                    return true;
                }else {
                    board[row][col]='.';
                }
            }
        }

        return false;
    }

    public static void solveSudoku(char[][] board) {

        int N=board.length;
        if (solve(board)){
            for (int r = 0; r < N; r++) {
                for (int d = 0; d < N; d++) {
                    System.out.print(board[r][d]);
                    System.out.print(" ");
                }
                System.out.print("\n");

//                if ((r + 1) % (int)Math.sqrt(N) == 0) {
//                    System.out.print("");
//                }
            }
        }

    }

    public static void main(String[] args) {

        char[][] board = { {
            '3', '.', '6', '5', '.', '8', '4', '.', '.'
        },
        {
            '5', '2', '.', '.', '.', '.', '.', '.', '.'
        },
        {
            '.', '8', '7', '.', '.', '.', '.', '3', '1'
        },
        {
            '.', '.', '3', '.', '1', '.', '.', '8', '.'
        },
        {
            '9', '.', '.', '8', '6', '3', '.', '.', '5'
        },
        {
            '.', '5', '.', '.', '9', '.', '6', '.', '.'
        },
        {
            '1', '3', '.', '.', '.', '.', '2', '5', '.'
        },
        {
            '.', '.', '.', '.', '.', '.', '.', '7', '4'
        },
        {
            '.', '.', '5', '2', '.', '6', '3', '.', '.'
        }
    };

        solveSudoku(board);
    }

}
