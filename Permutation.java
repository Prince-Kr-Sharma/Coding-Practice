package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
		int[] a= {1,2,3};
		System.out.println(permute(a));

	}
	
	 static List<List<Integer>> permute(int[] nums) {
	        List<List<Integer>> ans= new ArrayList<List<Integer>>();
	        boolean[] map= new boolean[nums.length];
	        permuteRec(nums, new ArrayList<Integer>(), ans, map);
	        return ans;
	    }
	 static void permuteRec(int[] arr, List<Integer> ls, List<List<Integer>> lss, boolean[] bool) {
		 if(ls.size()==arr.length) {
			 lss.add(new ArrayList<Integer>(ls));
			 return;
		 }
		 for(int i=0;i<arr.length;i++) {
			 if(!bool[i])// checking the bool array for marking {
				 bool[i]=true;  // marking bool array to true i.e. picked
				 ls.add(arr[i]);
				 permuteRec(arr, ls, lss, bool);
				 ls.remove(ls.size()-1);
				 bool[i]=false; //un-marking bool array to false i.e. unpicked
			 }
		 }
	 }

}
