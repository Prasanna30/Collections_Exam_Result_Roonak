import java.util.Deque;
import java.util.LinkedList;

public class Q15 {

	public static void main(String[] args) {
		Deque<String> CityName = new LinkedList<>();
		CityName.addFirst("San Jose"); 
		System.out.println(CityName);
		CityName.addFirst("Virginia");
		System.out.println(CityName);
		CityName.addLast("Washington DC");
		System.out.println(CityName);
		CityName.addLast("Texas");
		System.out.println(CityName);
		CityName.add("New York");
		System.out.println(CityName);
		CityName.poll();
		System.out.println(CityName);
		CityName.removeLast();
		System.out.println(CityName);

	}

}

