package StringBufferPart;

import java.util.Scanner;

public class Integer_Reverse_While_forloop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");

		int num = sc.nextInt(); // Suppose 1234

		// 1. using algorithm.......Reverse Number...

		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10; // How is calculate 0+1234 % 10=4,  40+3=43,  430+2=432  4320+1=4321
			num = num / 10;			   //1234/10=123,  123/10=12,   12/10=1, 1/10=0
		}
		System.out.println("Reverse Number is :" + rev);
	}
}
