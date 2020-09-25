import java.util.ArrayList;

public class Q4 {
	public static void main(String args[]) { 
        
		ArrayList<String>  list = new ArrayList<String>(); 
        list.add("Ronak"); 
        list.add("Halak"); 
        list.add("Paras"); 
        list.add("Arya"); 
        list.add("Bijal"); 
  
        System.out.println("ArrayList: "+ list); 
        list.add(2, "Mantavya");
        System.out.println("ArrayList: "+ list); 
    } 
	
}

