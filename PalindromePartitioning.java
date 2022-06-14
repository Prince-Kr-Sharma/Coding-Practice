package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> ans= new ArrayList<List<String>>();
		List<String> comb= new ArrayList<String>();
		String s="bba";
		solve(0, ans, comb, s);
		System.out.println(ans);

	}
	
	static void solve(int index, List<List<String>> lss, List<String> ls, String s) {
		if(index==s.length()) {
			lss.add(new ArrayList<>(ls));
			return;
		}
		for(int i=index;i<s.length();i++) {
			if(isPalindrome(s, index, i)) {
				ls.add(s.substring(index, i+1));
				solve(i+1, lss, ls, s);
				ls.remove(ls.size()-1);
			}
		}
	}
	
	static boolean isPalindrome(String s, int start, int end) {
		while(start<=end) {
			if(s.charAt(start)!=s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
