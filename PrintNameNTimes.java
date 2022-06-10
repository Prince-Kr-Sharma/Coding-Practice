package RecursionAndBacktracking;

public class PrintNameNTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(1,10);

	}
	
	
	static void print(int i, int n) {
		if(i>n) {
			System.out.println(i-1);
			return;
		}
		System.out.println("Prince");
		print(i+1, n);
		
		
	}

}
