package RecursionAndBacktracking;

public class PrintFromNTo1UsingBacktrack {

	public static void main(String[] args) {
		print(1,5);

	}
	
	static void print(int i, int n) {
		if(i>n)
			return;
		print(i+1,n);
		System.out.println(i);
	
	}

}
