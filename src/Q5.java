import java.util.ArrayList;

public class Q5 {
	public static void main(String args[]) { 
        
		ArrayList<String>  list = new ArrayList<String>(); 
        list.add("Ronak"); 
        list.add("Halak"); 
        list.add("Paras"); 
        list.add("Arya"); 
        list.add("Bijal"); 
  
        System.out.println("ArrayList: "+ list); 
        list.remove(2);
        System.out.println("ArrayList: "+ list); 
    } 
	
}

