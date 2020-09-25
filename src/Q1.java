import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Q1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "First_value");
		hmap.put(2, "Second_value");
		hmap.put(3, "Third_value");
		hmap.put(4, "Fourth_value");
		hmap.put(5, "Fifth_value");
		
		Set<Map.Entry<Integer, String>> entries = hmap.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> i = iterator.next();
			System.out.println(i);
		}
	}

}
