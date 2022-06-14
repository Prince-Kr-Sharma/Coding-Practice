package RecursionAndBacktracking;

public class SudokuSolver {

	public static void main(String[] args) {
		
		char[][] board= {
                {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
                };
		solveSudoku(board);
		for (int i = 0; i < 9; i++) {
		      for (int j = 0; j < 9; j++)
		        System.out.print(board[i][j] + " ");
		      System.out.println();
		    }
	}
	
	 static void solveSudoku(char[][] board) {
		 sodokuSolve(board);
	 }
	 
	 
		 static boolean sodokuSolve(char[][] board) {
			 for(int i=0;i<9;i++) {
				 for(int j=0;j<9;j++) {
					 if(board[i][j]=='.') {
						 for(char c='1';c<='9';c++) {
							 if(isSafe(i, j, board, c)) {
								 board[i][j]=c; 
							 if(sodokuSolve(board)) 
								 return true;
							 else board[i][j]='.';
							 }
						 }
						return false; 
					 }
				 }
			 }
			 return true;
		 }
		 
		 static boolean isSafe(int row, int col, char[][] board, char c) {
			 
			 for(int i=0;i<9;i++) {
				 
				 // checking all the column for possible present number
				 if(board[row][i]==c) return false;
				 
				 // checking all the row for possible present number
				 if(board[i][col]==c) return false;
				 
				 // checking 3x3 board out of given board for possible present number
				 // for given row and column 
				 if(board[3*(row/3)+ i/3 ][ 3* (col/3) + i % 3 ]==c) return false;
			 }
			 
			 return true;
		 }

}
