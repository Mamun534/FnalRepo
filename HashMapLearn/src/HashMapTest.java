import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {

		int a =10;
		int b =30;
		int c = 88;
			
		HashMap <String,Integer>hm = new HashMap<String,Integer>();
		
		hm.put("a",10);
		hm.put("b",30);
		hm.put("c",88);
		System.out.println(hm.get("b"));
	
	}

	
}
