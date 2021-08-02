package Array_Work;

public class Practies__Array {

	public static void main(String[] args) {
		
		int arr[] = {20,90,30,80,40,70,50,60};
		
		int HighestNumber =0;
		int SceondHighestNumber =0;
		
		for(int i = 0; i<arr.length; i++) {
			
			if (arr[i]>HighestNumber) {
				
				SceondHighestNumber = HighestNumber;
				
				HighestNumber=arr[i];
			}
			else if(arr[i]>SceondHighestNumber) {
				
				SceondHighestNumber = arr[i];
			}	
		}
		
		System.out.println("total Lenght....................."+arr.length);
		System.out.println("SceondHighestNumber............."+HighestNumber);
		System.out.println("SceondHighestNumber............."+SceondHighestNumber);
	}
}
