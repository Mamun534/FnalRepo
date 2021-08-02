package Array_Work;

import java.util.Arrays;

public class arrrrrrrrrr {

	// public = for accesses to jvm = java virtual machine(JVM)..
	// static = jvm calling the method but with out creating an object..
	//void = not return type in this method.....
	//maim = this is the class name ............
	
	public static void main(String[] args) {

		int arr[] = { 10, 90, 20, 80, 30, 70, 40, 60, 50 };
		
			Arrays.sort(arr);
			System.out.println("Sort Arrays.........."+Arrays.toString(arr));

			int count = arr.length;
			
			for(int i =0; i<count; i++) {
				
				for(int j =i+1; j<count; j++) {
					
					if(arr[i]>arr[j]) {
						
						int a=arr[i];
						arr[i]=arr[j];
						arr[j]=a;
						
					}
					
				}
				
			}
			
			System.out.println(".........This is for Array without sorted........");
			
			System.out.println("Largest Number : "+arr[count-1]);
		/*
		 * System.out.println("2nd Largest : "+arr[count-2]);
		 * System.out.println("Lowest number : "+arr[0]);
		 * System.out.println("2nd Lowest number :"+arr[1]);
		 */
	}
}