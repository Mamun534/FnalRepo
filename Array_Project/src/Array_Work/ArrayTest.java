package Array_Work;

public class ArrayTest {

	public static void main(String[] args) {
		
		int arr[] = {10,90,20,80,30,70,40,60,50};
		
		int thardHighest = 0;
		int HighestNumber = 0;
		int SceondHighestNum = 0;
		
		for (int i = 0; i<arr.length; i++ ){
			
			if (arr[i]>HighestNumber) {
				
				SceondHighestNum = HighestNumber ;
				HighestNumber = arr[i];
			}
			
		else if (arr[i] > SceondHighestNum) {
							
				SceondHighestNum = arr[i];
				
				}
			
		else if (arr[i]>thardHighest) {
			
			thardHighest=SceondHighestNum;
			thardHighest = arr[i];
			
		}
			}
		
		System.out.println("HighestNum............"+HighestNumber);
		System.out.println("SceondHighestNum......"+SceondHighestNum);
		System.out.println("thardHighestNum......."+thardHighest);
		
		}
			
	}


