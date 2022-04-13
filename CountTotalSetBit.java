import java.util.Scanner;

public class CountTotalSetBit {
	
	static int n;
	
	public static int countSetBitMethod1(int n) {
		int res=0;
		while(n>0) {
		n=(n&(n-1)); // Method 1: Using Brain Kerningam's Algorithm- It perform AND operation on given number with given number-1 till
					// its becomes zero. The idea here is that when we subtract 1 from a number then its all the zeros from the last set
					// bit becomes one's and the last set bit becomes zero. 
		res++;  
		}
		return res;	
	}
	
	public static int countSetBitMethod2(int n) {
		int res=0;
		while(n>0) {
			if((n&1)==1) { // Method 2: Using Naive approach First AND operation with given number and 1 which will result in either zero
						// or one and if it is one then count and after that the given number shifted by 1 and again the AND operation.
				res++;
			}
			n=n>>1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int test_case=sc.nextInt();
		while(test_case>0) {
			n=sc.nextInt();
			System.out.println(countSetBitMethod1(n));
			test_case--;
		}
		
		sc.close();
	}

}
