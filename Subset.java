package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {1,2,3};
		System.out.println(subsets(n));

	}
	
	static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> ans= new ArrayList<List<Integer>>();
		combination(0, new ArrayList<Integer>(), nums, ans);
		return ans;
        
    } 
	
	static void combination(int index, List<Integer> ls, int[] arr, List<List<Integer>> lss) {
		if(index==arr.length) {
			lss.add(new ArrayList<Integer>(ls));
			return;
		}
		
	
			ls.add(arr[index]);
			combination(index+1, ls, arr, lss);
			ls.remove(ls.size()-1);
			combination(index+1, ls, arr, lss);
		
	}

}
