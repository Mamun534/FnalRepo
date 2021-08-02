package Array_Work;

import java.util.*;

public class Array_Work_No_sorted {
	
	public static void main(String[] args) {
		
		int a;
		int arr[] = { 55, 10, 8, 90, 43, 87, 95, 25, 50, 12 };
		
		System.out.println("Array = " + Arrays.toString(arr));
		int count = arr.length;
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (arr[i] > arr[j]) {
					a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}
		
		System.out.println("Largest: " + arr[count - 1]);
		System.out.println("Second Largest: " + arr[count - 2]);
		System.out.println("Smallest: " + arr[0]);
		System.out.println("Second Smallest: " + arr[1]);
	}
}