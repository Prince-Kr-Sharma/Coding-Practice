import java.util.ArrayList;

public class PathCountInMatrix {

	public static void main(String[] args) {
		System.out.println(pathWithObsticles("",maze,3, 3));

	}
	
	static int countPath(int row, int col) {
		
		if(row==1 || col==1) {
			return 1;
		}
		int left= countPath(row-1, col);
		int right= countPath(row, col-1);
		
		return left+right;
		
	}
	
	
	static ArrayList<String> printPath(String p, int row, int col) {
		
		if(row==1 && col==1) {
			ArrayList<String> list= new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list = new ArrayList<String>();
		if(row>1) {
		list.addAll(printPath(p+'D',row-1, col));
		}
		if(col>1) {
		list.addAll(printPath(p+'R',row, col-1));
		}
		return list;
		
	}

	static ArrayList<String> printPathValue(String p, int row, int col) {
		
		if(row==1 && col==1) {
			ArrayList<String> list= new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list = new ArrayList<String>();
		if(row>1) {
		list.addAll(printPathValue(p+"("+(row-1)+","+col+")",row-1, col));
		}
		if(col>1) {
		list.addAll(printPathValue(p+"("+row+","+(col-1)+")",row, col-1));
		}
		return list;
		
	}
	
	static ArrayList<String> printPathIncludingDiagnol(String p, int row, int col){
		if(row==1 && col==1) {
			ArrayList<String> list=new ArrayList<String>();
			list.add(p);
			return list;
		}
		ArrayList<String> list= new ArrayList<String>();
		if(row>1 && col>1) {
			list.addAll(printPathIncludingDiagnol(p+'D', row-1, col-1));
		}
		if(row>1) {
			
			list.addAll(printPathIncludingDiagnol(p+'V', row-1, col));
		}
		if(col>1) {
			list.addAll(printPathIncludingDiagnol(p+'H', row, col-1));
		}
		return list;
	}
	
	static boolean[][] maze= {
			{true, true,false},
			{true,false,true},
			{true,true,true}
	};
	static ArrayList<String> pathWithObsticles(String p, boolean[][] maze, int row, int col){
		if(row==(maze.length-1) && col==(maze[0].length-1)) {
			ArrayList<String> list= new ArrayList<String>();
			list.add(p);
			return list;
		}
		ArrayList<String> list= new ArrayList<String>();
		if(!maze[row][col]) {
			return null;
		}
		if(row<maze.length-1) {
			list.addAll(pathWithObsticles(p+'V', maze, row+1, col));
		}
		if(col<maze[0].length-1) {
			list.addAll(pathWithObsticles(p+'H', maze, row, col+1));
		}
		if(row<maze.length-1 && col<maze[0].length-1) {
			list.addAll(pathWithObsticles(p+'D', maze, row+1, col+1));
		}
		return list;
	}

}
