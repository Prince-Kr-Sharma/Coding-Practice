package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class CountSubSequenceWhoseSumIsK {
	
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls= new ArrayList<Integer>();
		int[] a= {1,2,1,2,1,3,4,1,1};
		int res= countSubSeqSumK(0, 2, 0, a, ls);
		System.out.println(res);

	}
	// Method 1
	static int countSubSeqSumK(int ind, int reqSum, int currSum, int[] arr, List<Integer> ls) {
		
		if(ind==arr.length) {
			if(currSum==reqSum) {
				count+=1;
			}
			return 0;
		}
		ls.add(arr[ind]);
		currSum+=arr[ind];
		countSubSeqSumK(ind+1, reqSum, currSum, arr, ls);
		currSum-=arr[ind];
		ls.remove(ls.size()-1);
		countSubSeqSumK(ind+1, reqSum, currSum, arr, ls);
		return count;
	}
	
	// Method 2
	
	static int countSubSeqSumK1(int ind, int reqSum, int currSum, int[] arr, List<Integer> ls) {
		
		if(ind==arr.length) {
			if(reqSum==currSum) return 1;
			return 0;
		}
		ls.add(arr[ind]);
		currSum+=arr[ind];
		int left= countSubSeqSumK1(ind+1, reqSum, currSum, arr, ls);
		currSum-=arr[ind];
		ls.remove(ls.size()-1);
		int right= countSubSeqSumK1(ind+1, reqSum, currSum, arr, ls);
		return left+right;
	}
	

}
