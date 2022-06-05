package RecursionAndBacktracking;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayUsingRecursion {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		reverseWith2Pointer(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		int[] resu= reverseWith1Pointer(arr, 0);
		System.out.println(Arrays.toString(resu));
		
		sc.close();
	}
	
	static int[] reverseWith2Pointer(int[] a, int r, int l) {
		if(r==((a.length-1)/2))
				return a;
		int temp=a[r];
		a[r]=a[l];
		a[l]=temp;
		return reverseWith2Pointer(a, r+1, l-1);
	}
	
	static int[] reverseWith1Pointer(int[] a,int s) {
		if(s==((a.length-1)/2))
			return a;
		int temp=a[s];
		a[s]=a[a.length-1-s];
		a[a.length-1-s]=temp;
		return reverseWith1Pointer(a, s+1);
	}
	
}
