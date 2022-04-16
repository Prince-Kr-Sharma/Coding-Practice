
public class FindingMissingNumber {
	
	public static int missingNumber(int[] nums) {
        int res=0;
        int out=0;
        for(int i=0;i<nums.length;i++){
            res=res^nums[i];
            out=i^(i+1);   
        }
        if((res^out)==3){
            return (res^out)-1;
        }else
            return (res^out);
    }
	
	public static void main(String[] args) {
		
		int arr[]= {0,1,3};
		System.out.println(missingNumber(arr));
	}

}


