package Array_Work;

import java.util.Arrays;

public class Array_Practies {

	public static void main(String[] args) {

		int[] x = { 23, 12, 65, 87, 98, 95 };

		System.out.println("Array =" + Arrays.toString(x));
		Arrays.sort(x);
		System.out.println("Sorted Array = " + Arrays.toString(x));

		System.out.println("This Bigest Number = " + x[5]);
		System.out.println("This is 2nd Bigest Number=" + x[4]);
		System.out.println("This is 3rd Bigest Number =" + x[3]);

		System.out.println("This lowest Number =" + x[0]);
		System.out.println("This 2nd Lowest Number=" + x[1]);
		System.out.println("This is 3rd Lowest Number=" + x[2]);
	}

	// ..........................................

	public Array_Practies() {

		int[] y = { 23, 12, 65, 87, 98, 95 };

		System.out.println("Array =" + Arrays.toString(y));
		Arrays.sort(y);
		System.out.println("Sorted Arrays = " + Arrays.toString(y));

		System.out.println("This Big =" + y[5]);
		System.out.println("This Lowest=" + y[0]);
	}

	public void Array_Practies1() {

		int[] y = { 23, 12, 65, 87, 98, 95 };

		System.out.println("Array=" + Arrays.toString(y));
		Arrays.sort(y);
		System.out.println("Sorted Arrays=" + Arrays.toString(y));

		System.out.println("This 3rd Lowest Numver=" + y[2]);

		// ........................................................................

		int[] z = { 23, 12, 65, 87, 98, 95 };

		System.out.println("Array=" + Arrays.toString(z));
		Arrays.sort(z);
		System.out.println("Sorted Arrays=" + Arrays.toString(z));

		System.out.println("This  Highest Number=" + z[5]);
//...............................................................................................		

		int[] s = { 23, 12, 65, 87, 98, 95 };

		System.out.println("Array=" + Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("Sorted Arrays=" + Arrays.toString(s));

		System.out.println("This is 3rd Lowest Number=" + s[2]);

	}
}
