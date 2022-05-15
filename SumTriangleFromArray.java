import java.util.Arrays;

public class SumTriangleFromArray {

	public static void main(String[] args) {
		int[] ar= {1, 2, 3, 4, 5};
		
		sumTri(ar);	
	}
	
	
	static void sumTri(int[] arr) {
		if(arr.length<1)
			return;
		
		int sum[]= new int[arr.length-1];
		for(int i=0;i<arr.length-1;i++) {
			int x=arr[i]+arr[i+1];
			sum[i]=x;
		}
		
		sumTri(sum);
		System.out.println(Arrays.toString(arr));
	}

}
