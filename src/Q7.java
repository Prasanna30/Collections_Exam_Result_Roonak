import java.util.Set;
import java.util.HashSet;

public class Q7 {
public static void main(String args[]) { 
        
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		Integer[] arr = new Integer[set.size()];
		arr = set.toArray(arr);
		for(int i: arr) {
			System.out.println(i);
		}
    } 
}
