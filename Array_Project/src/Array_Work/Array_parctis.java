package Array_Work;

import java.util.Arrays;

public class Array_parctis {

	public static void main(String[] args) {
		
		int [] b = {12,98,32,76,89,45};
		
		System.out.println("Array="+Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("Sorted Arrays="+Arrays.toString(b));
	
		System.out.println("This 2nd Highest Number="+b[4]);
		System.out.println("This is Lowest Number="+b[0]);
	
	}


}
