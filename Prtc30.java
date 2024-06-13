// N Queen's problem
public class Prtc30 {
    public static int solutionCount=0;
    public static boolean isSafe( char[][] chessBoard, int row, int col){
        for(int i=row-1;i>=0;i--){
            if(chessBoard[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<chessBoard.length;i--,j++){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
    public static void nQueens(char[][] chessBoard, int row){
        if(row==chessBoard.length){
            printChessBoard(chessBoard);
            solutionCount++;

            return;
        }
        for(int j=0;j< chessBoard.length;j++){
            if(isSafe(chessBoard, row, j)){

                chessBoard[row][j]='Q';
                nQueens(chessBoard,row+1 );
                chessBoard[row][j]='x';
            }
        }
    }
    public static void printChessBoard(char[][] chessBoard){
        System.out.println("---------ChessBoard-------");
        for(int i=0;i< chessBoard.length;i++){
            for(int j=0;j< chessBoard.length;j++){
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        int n=5;
        char[][] chessboard= new char[n][n];
        for(int i=0;i<chessboard.length;i++){
            for(int j=0;j< chessboard.length;j++){
                chessboard[i][j]='x';

            }
        }
        nQueens(chessboard,0);
        System.out.println("No. of solutions for "+n+" queen's = "+solutionCount);


    }
}
