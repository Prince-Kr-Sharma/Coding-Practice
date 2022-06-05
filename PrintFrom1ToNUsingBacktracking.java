package RecursionAndBacktracking;

public class PrintFrom1ToNUsingBacktracking {

	public static void main(String[] args) {
		print(5,5);
		
	}
	
	static void print(int i, int n) {
		if(i<1)
			return;
		print(i-1,n); /// Backtracking since print statement will only execute when the 
					//// base condition will hit i.e. once the base condition execute the function call 
						/// will return and along with that the next line which is print statement will execute
		System.out.println(i);
	}

}
