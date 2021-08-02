package StringBufferPart;

public class StringBuilder_Reverse_String {

	public static void main(String[] args) {
	
		String num = "Mamun Chowdhury";
	
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println("String Reverse :"+rev);
	}
}
