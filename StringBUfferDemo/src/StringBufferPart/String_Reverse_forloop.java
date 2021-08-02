package StringBufferPart;

public class String_Reverse_forloop{

	public static void main(String[] args) {
		
		String num = "GOD";
		String rev = "";
		
		int len = num.length();
		
		for(int i=len-1; i>=0; i--) {
			
			rev = rev+num.charAt(i);
			
		}
		System.out.println("Reverse String Value:......."+rev);
	}

}
