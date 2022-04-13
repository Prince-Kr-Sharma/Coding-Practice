import java.util.Scanner;

public class CheckKthBit {
	
	static int k;
	static int n;

	    // Function to check if Kth bit is set or not.
	    static boolean checkKthBit(int n, int k)
	    {
	        if((n & (1 << k) )> 0) // First left-shift 1 by k place and then do bitwise AND operation.
	            return true;
	        else
	            return false;
	    }
	    
	    public static void main(String[] args) {
	    	
	    	Scanner sc= new Scanner(System.in);
	    	int test_case=sc.nextInt();
	    	while(test_case>0) {
	    	n= sc.nextInt();
	    	k=sc.nextInt();
	    	
	    	if(checkKthBit(n, k)==true) {
	    		System.out.println("Yes");
	    	} else {
	    		System.out.println("No");
	    	}
	    	test_case--;
	    	}
	    	sc.close();
	    }
	}

