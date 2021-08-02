package Array_Work;

import java.util.Arrays;

public class Arraylargest{

	public static void main(String[] args) {
		

		int num[] = { 10, 90, 20, 80, 30, 70, 40, 60, 50 };
		
		Arrays.sort(num);
		System.out.println("Sort Arrays.........."+Arrays.toString(num));
		
		int Highest = 0;
		int SceondHigh = 0;
		int ThardHigh = 0;
		int fourthlowest =0;
	
		for (int i=0; i<num.length; i++) {

			if (num[i]>Highest) {

				fourthlowest = ThardHigh;
				ThardHigh = SceondHigh;
				SceondHigh = Highest;
				Highest = num[i];
				
			}

			else if (num[i]>SceondHigh) {

				SceondHigh = num[i];
			}
			
			else if(num[i]>ThardHigh) {
				
				ThardHigh=num[i];
			}
			
			else if (num[i]>fourthlowest) {
				
				fourthlowest=num[i];
			}
		}
		
		System.out.println("Highest.................."+Highest);
		System.out.println("SceondHigh..............."+SceondHigh);
		System.out.println("ThardHigh................"+ThardHigh);
		System.out.println("Lowest..................."+fourthlowest);
	}

}
