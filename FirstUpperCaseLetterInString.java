
public class FirstUpperCaseLetterInString {

	public static void main(String[] args) {
		
		String str="adadkdasfewafefawe3rFDEDFFqwd";
		System.out.println(upperCharAt(str, 0));
	}
	
	static char upperCharAt(String str, int i) {
		
		if(str.charAt(i)=='\0')
			return 0;
		if(Character.isUpperCase(str.charAt(i))) {
			return str.charAt(i);
		}
		else {
			return upperCharAt(str, i+1);
		}
		

	}
	
}
