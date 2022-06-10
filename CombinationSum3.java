package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(combinationSum3(3, 7));

	}

	static List<List<Integer>> combinationSum3(int k, int n) {
		int tar=n;
		List<List<Integer>> ans= new ArrayList<>();
		combination(1, new ArrayList<Integer>(), ans, k, n, tar);
		return ans;

	}

	static void combination(int ind, List<Integer> ls, List<List<Integer>> lss, int k, int n, int tar) {
		if(ls.size()==k) {
			if(tar==0) {
				lss.add(new ArrayList<Integer>(ls));
			}
			return;
		}
		for(int i=ind;i<=9;i++) {
			if(i>tar) break;
			else{
				ls.add(i);
				combination(i+1, ls, lss, k, n, tar-i);
				ls.remove(ls.size()-1);

			}
		}

	}

}
