package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {

	public static void main(String[] args) {
		
		int[] a={1,2,2};
		System.out.println(subsetsWithDup(a));

	}
	
	
	static List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> ans= new ArrayList<List<Integer>>();
		subset2(0, nums, new ArrayList<Integer>(), ans);
		return ans;
        
    }
	
	static void subset2(int index, int[] arr, List<Integer> ls, List<List<Integer>> lss) {
		lss.add(new ArrayList<Integer>(ls));
		for(int i=index;i<arr.length;i++) {
			if(i!=index && arr[i]==arr[i-1]) continue;
			ls.add(arr[i]);
			subset2(i+1, arr, ls, lss);
			ls.remove(ls.size()-1);
		}
	}

}
