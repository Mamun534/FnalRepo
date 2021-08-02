package StringBufferPart;

import java.util.Scanner;

public class Integer_Reverse_StingBuilder_{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int num = sc.nextInt();

		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println("Reverse Number is :" + rev);
		
	}

}
