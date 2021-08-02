package Array_Work;

public class Arrys_Final_Work {

	public static void main(String[] args) {

		int num[] = { 49, 20, 56, 24, 67, 12, 39, 95, 76, 99 };
		
		int highest = 0;
		int sceondhighest = 0;
		
		System.out.println("Total Lenght..........."+num.length);
	
		for (int i = 0; i < num.length; i++) {

			if (num[i] > highest) {

				sceondhighest = highest;
				highest = num[i];
			}

			else if (num[i] > sceondhighest) {

				sceondhighest = num[i];
			}
		}
		
		System.out.println("Highest number........."+ highest);
		System.out.println("Sceond Highest number..."+ sceondhighest);
	}

}
