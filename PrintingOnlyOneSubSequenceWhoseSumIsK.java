package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PrintingOnlyOneSubSequenceWhoseSumIsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l= new ArrayList<Integer>();
		int[] a= {1,2,1};
		oneSubSeqSumK(0, 2, 0, a, l);

	}
	
	static boolean oneSubSeqSumK(int ind, int reqSum, int currSum, int[] arr, List<Integer> ls) {
		if(ind==arr.length) {
			if(currSum==reqSum) {
				for(Object obj:ls) System.out.print(obj+" ");
				System.out.println();
				return true;
			}
			
			return false;
		}
		ls.add(arr[ind]);
		currSum+=arr[ind];
		if(oneSubSeqSumK(ind+1, reqSum, currSum, arr, ls)==true) return true;
		currSum-=arr[ind];
		ls.remove(ls.size()-1);
		if(oneSubSeqSumK(ind+1, reqSum, currSum, arr, ls)==true) return true;
		return false;
		
	}

}
