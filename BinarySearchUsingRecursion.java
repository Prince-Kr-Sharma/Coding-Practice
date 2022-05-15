
public class BinarySearchUsingRecursion {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,4,5,7,8,9,14,67};
		System.out.println(arraySearch(arr, 14,0,arr.length-1));
		
	}
	
	static int arraySearch(int[] arr, int tar, int start, int end) {
		
		int mid= start+(end-start)/2;
		if(end>=start) {
		
		if(tar==arr[mid]) {
			return mid;
		}
		
		if(tar<arr[mid]) {
			
			return arraySearch(arr, tar, start, end-1);
		}
		else
			return arraySearch(arr, tar, mid+1, end);
		}
		return -1;
	}

}
