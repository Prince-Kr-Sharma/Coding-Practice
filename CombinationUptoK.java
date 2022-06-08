package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationUptoK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(combine(4, 2));

	}
	static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res= new ArrayList<List<Integer>>();
		combinationUptoK(0, k, n, res, new ArrayList<Integer>());
		return res;
	        
	    }
	    
	    static void combinationUptoK(int ind, int k, int n, List<List<Integer>> lss, List<Integer> ls ) {

	    		if(ls.size()==k) {
	    		lss.add(new ArrayList<Integer>(ls));
	    		return;
	    		}
	  
	    	for(int i=ind; i<n;i++) {
	    	ls.add(i+1);
	    	combinationUptoK(i+1, k, n, lss, ls);
	    	ls.remove(ls.size()-1);
	    	}
	    }

}
