package Array_Work;

import java.util.Arrays;

public class ArryPact {

	public static void main(String[] args) {
		
		int a[] = {55, 10, 8, 90, 43, 87, 95, 25, 50, 12};
		
		System.out.println("Array = "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array Sorted"+Arrays.toString(a));
		
		System.out.println("3rd Highest Number="+a[7]);
	}

}
