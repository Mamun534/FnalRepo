package Array_Work;

import java.util.Arrays;

public class Array_My_issue {

	public static void main(String[] args) {

		// find the 2nd highest value....

		int A[] = { 1, 4, 67, 55, 45, 12 }; // not arrange array..
			
		//=	0, 1,  2, 3,  4,  5, how the array count from..0......5 = 6 value..
		
		// Here im taking the (toString) of the resone when im going 
		//to return type will be int A which is String.....A.
		
		System.out.println("Array="+Arrays.toString(A));
		
		System.out.println("The lenght of Array...."+A.length);
	
		// For arrange the arrays i have to use sorted......follow in console...[1, 4, 12, 45, 55, 67]
		
		Arrays.sort(A);
		
		System.out.println("Sorted Array="+Arrays.toString(A));
 	
		System.out.println("First Highest Value="+A[5]);
		
		System.out.println("Sceond Highest Value ="+A[4]);
		
		System.out.println("Therd Highets Value="+A[3]);
		
		System.out.println("First lowest Value="+A[0]);
		
		System.out.println("Sceond Lowest Value="+A[1]);
		
		System.out.println("Therd Lowest Value="+A[2]);
		
	}

}
