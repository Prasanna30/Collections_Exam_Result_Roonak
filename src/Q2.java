import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q2 {

	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(3, "Third_value");
		hmap.put(4, "Fourth_value");
		hmap.put(1, "First_value");
		hmap.put(5, "Fifth_value");
		hmap.put(2, "Second_value");
		
		TreeMap<Integer, String> sorted = new TreeMap<Integer, String>(); 
		sorted.putAll(hmap); 
		
		for(Map.Entry<Integer, String> entry: sorted.entrySet()) {
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
	}

}