package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class SubsequencesIMPORTANT {

	public static void main(String[] args) {
		
		List<Integer> lst= new ArrayList<Integer>();
		int[] a= {3,1,2};
		printSub(lst, 0, a);
		
	}
	
	static void printSub(List<Integer> l, int i, int[] arr) {
		if(i==arr.length) {
			for(Object it:l) {
				System.out.print(it+" ");
			}
			if(l.size()==0)
				System.out.print("{}");
			
			System.out.println();
			return;
		}
		
		l.add(arr[i]); // Take it
		printSub(l, i+1, arr);
		l.remove(l.size()-1); // don't take
		printSub(l, i+1, arr);
		
	}

}
