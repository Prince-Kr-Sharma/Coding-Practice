package RecursionAndBacktracking;

public class SumOfNNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(5);

	}
	
	static void sum(int n) {
		helper(0,0,n);
	}
	
	
	static void helper(int i, int Sum,int n) {
		
		if(i>n) {
			System.out.println(Sum);
			return;
		}
		helper(i+1,Sum+i,n);
		
	}
	

}
