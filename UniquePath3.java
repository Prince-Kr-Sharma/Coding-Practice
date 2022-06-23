package RecursionAndBacktracking;

public class UniquePath3 {
	
	static int m;
	static int n;
	static int numPath;
	static int cellWithoutObs;
	
	public static void main(String[] args) {
		

	}
	
	static int uniquePathsIII(int[][] grid) {
		
		int startRow=0;
		int startCol=0;
		int count=0;
		cellWithoutObs=0;
        numPath=0;
		
		m=grid.length;  // size of row
		n=grid[0].length; // size of col
		
		/// finding the starting point and number of cell which is empty.
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(grid[i][j]==1) {
					startRow=i;
					startCol=j;
					cellWithoutObs++;
				}
				else if(grid[i][j]==0) {
					cellWithoutObs++;
				}
			}
		}
		
		dfs(startRow, startCol, grid, count);
		return numPath;
		
	}
	
	static void dfs(int row, int col, int[][] grid, int count) {
		
		if(row<0 || row>grid.length-1 || col<0 || col>grid[0].length-1 || grid[row][col]==-1) {
			return;
		}
		
		if(grid[row][col]==2) {
			if(count==cellWithoutObs) {
				numPath++;
			}
			return;
		}
		grid[row][col]=-1;
		dfs(row, col+1, grid, count+1); //to move right in row
		dfs(row, col-1, grid, count+1); // to move left in row
		dfs(row+1, col, grid, count+1); // to move down in col
		dfs(row-1, col, grid, count+1); // to move up in col
		grid[row][col]=0;
	}

}
