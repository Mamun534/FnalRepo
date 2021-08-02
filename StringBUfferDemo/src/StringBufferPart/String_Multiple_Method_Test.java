package StringBufferPart;

public class String_Multiple_Method_Test{

	public static void main(String[] args) {

		// This is for string capacity ..

		StringBuffer sb = new StringBuffer("Mamun"); // string capacity(16) + string length(mamun) = 21.
		System.out.println(sb.capacity()); // this how many capacity i can store in string buffer class always 16

		StringBuffer sb1 = new StringBuffer("chowdhury");
		sb.append("bangl");
		System.out.println(sb1.capacity());

		StringBuffer sb2 = new StringBuffer("shelly");
		sb.append("my country is my love"); // when the capacity going to more then current capacity
		System.out.println(sb2.capacity()); // that time calculate , old capacity+new capacity

		// This is for string length..........

		StringBuffer sb3 = new StringBuffer("Noakhali");
		System.out.println(sb3.length()); // how many character i can store thats means length.

		// This is for charAt method

		StringBuffer sb4 = new StringBuffer("Bangladesh");
		System.out.println(sb4.charAt(0)); // charAt(0) means stringbuffer class a after 0 character show..
											// Like "Bangladesh" charAt = B,

		// This for DeleteCharAt Method

		StringBuffer sb5 = new StringBuffer("mamunchowdhury");
		System.out.println(sb5.delete(2, 5));
		System.out.println(sb5.deleteCharAt(3)); // that means delete from mamun to mun this 3 character.

		// This is for equals method

		System.out.println(sb.equals(sb));
		System.out.println(sb.equals(sb1));
		System.out.println(sb.equals(sb2));
		System.out.println(sb.equals(sb3));
		System.out.println(sb.equals(sb4));

		// This is for indexof method and lastindexof method.....

		StringBuffer sb6 = new StringBuffer("mamunchowdhury");
		System.out.println(sb6.indexOf("m")); // indexof means its provide me position of index.
		System.out.println(sb6.indexOf("y")); // here from mamun "u" position is 3......

		System.out.println(sb6.lastIndexOf("d"));
		
		
		
		// This is string Reverse method ......
		
		
		  StringBuffer sb7 = new StringBuffer("GOD");
		  System.out.println(sb7.reverse());
		
		
		// string reverse using for loop.......
		
		String num = "DOG";
		String rev = "";
		
		int len = num.length();
		
		for(int i=len-1; i>=0; i--) {
			
			rev = rev+num.charAt(i);	
		}
		
		System.out.println("Reverse String Value:......."+rev);
	}

}
