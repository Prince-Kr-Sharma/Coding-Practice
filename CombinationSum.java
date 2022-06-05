package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {2,3,6,7};
		int target = 7;
		System.out.println(combinationSum(candidates,target));
	}
	
	 public static List<List<Integer>> combinationSum(int[] candidates, int target) {
	        List<List<Integer>> res= new ArrayList<List<Integer>>();
	        combination(target, 0, res, new ArrayList<Integer>(), candidates);
	        return res;
	    }
	 
	 static void combination(int tar, int ind, List<List<Integer>> re, List<Integer> ls, int[] arr) {
		 if(ind==arr.length) {
			 if(tar==0) {
				 re.add(new ArrayList<Integer>(ls));
			 }
			 return;
		 }
		 if(tar>=arr[ind]) {
			 ls.add(arr[ind]);
			 combination(tar-arr[ind], ind, re, ls, arr);
			 ls.remove(ls.size()-1);
		 }
		 
		 combination(tar, ind+1, re, ls, arr);
	 }

}
