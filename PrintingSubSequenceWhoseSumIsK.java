package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PrintingSubSequenceWhoseSumIsK {

	public static void main(String[] args) {
		
		int[] a= {1,2,1};
		List<Integer> l= new ArrayList<Integer>();
		subSeqSumK(2, 0, l, a, 0);
		
	}
	
	static void subSeqSumK(int reqSum, int index, List<Integer> ls, int[] arr, int currSum) {
		
		if(index==arr.length) {
			if(currSum==reqSum) {
				for(Object obj: ls) {
					System.out.print(obj+" ");
				}
				System.out.println();
			}  
			return;
		}
		// Picking the element of array for combination to make sum
		ls.add(arr[index]);								
		currSum+=arr[index];			
		subSeqSumK(reqSum, index+1, ls, arr,currSum );	
		ls.remove(ls.size()-1);							
		currSum-=arr[index];	
		// Not Picking the element of array for combination to make sum
		subSeqSumK(reqSum, index+1, ls, arr, currSum);  // Not Pick
		
	}
}
