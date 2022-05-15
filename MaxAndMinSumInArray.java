
public class MaxAndMinSumInArray {

	public static void main(String[] args) {
		
		int arr[]= {1, 4, 3, -5, -4, 8, 6};
		int max=Integer.MIN_VALUE;
		int min= Integer.MAX_VALUE;
		maxMin(arr,max,min,0);

	}
	
	
	static void maxMin(int[] arr,int max, int min, int index ) {
		
		int l= arr.length-1;
		
		if(arr[index]==l) {
			System.out.println("max: "+max+", min: "+min);
			return;
		}
		if(arr[index]>max) {
			max=arr[index];
		}
		if(arr[index]<min) {
			min=arr[index];
		}
		maxMin(arr,max,min,index+1);
		
	}

}
