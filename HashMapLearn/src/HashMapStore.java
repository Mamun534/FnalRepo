import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class HashMapStore {

	private static Object Unsortedmap;

	public static void main(String[] args, Object Unsorted) {

		String a = "Mamun";
		int b = 10;
		int c = 30;
		
		
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("a",10);
		hm.put("b",20);
		hm.put("c", 30);
		System.out.println(hm.get("a"));
		System.out.println(hm.get("b"));
		
	}
}