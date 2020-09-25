import java.util.ArrayList;
import java.util.Collections;

public class Q3 {
	public static void main(String args[]) { 
        
		ArrayList<String>  list = new ArrayList<String>(); 
        list.add("Ronak"); 
        list.add("Halak"); 
        list.add("Paras"); 
        list.add("Arya"); 
        list.add("Bijal"); 
  
        System.out.println("Unsorted ArrayList: "+ list); 
        Collections.sort(list, Collections.reverseOrder()); 
        System.out.println("Sorted ArrayList "+ "in Descending order : " + list); 
    } 
	
}
