import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Q8 {
	public static void main(String args[]) { 
        
		List<String> list = new ArrayList<String>(); 
        list.add("Ronak"); 
        list.add("Halak"); 
        list.add("Paras"); 
        list.add("Arya"); 
        list.add("Bijal"); 
  
        System.out.println("ArrayList: "+ list); 
        Collections.reverse(list);
        System.out.println("Reversed ArrayList: "+ list); 
    } 
	
}