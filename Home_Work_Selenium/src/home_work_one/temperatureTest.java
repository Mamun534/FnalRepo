package home_work_one;

import java.util.Scanner;

public class temperatureTest {

	public static void main(String[] args) {
		
		// Temperature Test
		
		Scanner sc = new Scanner(System.in);
		
		double farenhiteTemperature;
		
		System.out.println("farenhiteTemperature");
		
		farenhiteTemperature=sc.nextDouble();
		
		double celsiusTemperature = (farenhiteTemperature-32)*5/9;
		
		System.out.println("celsiusTemperature:"+celsiusTemperature);
		
	}

}
