package Array_Work;
import java.util.Arrays;

public class Array_Work_Sorted {
	
   public static void main(String []args){
	   
      int a[] = {55, 10, 8, 90, 43, 87, 95, 25, 50, 12};
      System.out.println("Array = "+Arrays.toString(a));
      Arrays.sort(a);
      System.out.println("Sorted Array = "+Arrays.toString(a));
      
      System.out.println("Smallest element = "+a[0]);
      System.out.println("2nd Smallest element = "+a[1]);
      System.out.println("Largest element = "+a[9]);
      System.out.println("2nd Largest element = "+a[8]);
      
   }
}