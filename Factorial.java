package RecursionAndBacktracking;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res= fact(-5);
		System.out.println(res);

	}
	
	static int fact(int n) {
		if(n<0)
			return 0;
		else if(n==0 || n==1)
			return 1;
		return n*fact(n-1);
	}

}
