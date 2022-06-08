package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ans= new ArrayList<Integer>();
		ans.addAll(Arrays.asList(2, 3));
		int n=ans.size();
		System.out.println(subsetSums(ans,n));

	}
	
	static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
		
        // code here
		ArrayList<Integer> ans= new ArrayList<Integer>();
		combination(arr, N, 0, 0, new ArrayList<Integer>(),ans );
		Collections.sort(ans);
		return ans;
    }
	
	static void combination(ArrayList<Integer> a, int n, int sum, int index,ArrayList<Integer> ar,ArrayList<Integer> ans) {
		if(index==n) {
			ans.add(sum);
			return;
		}
		
		ar.add(a.get(index));
		combination(a, n, sum+a.get(index), index+1, ar,ans);
		ar.remove(ar.size()-1);
		combination(a, n, sum, index+1, ar,ans);
	}

}
