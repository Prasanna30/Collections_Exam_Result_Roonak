import java.util.LinkedList;
import java.util.ArrayList;

public class Q6 {
	public static void main(String args[]) { 
        
		LinkedList<String>  list = new LinkedList<String>(); 
        list.add("Ronak"); 
        list.add("Halak"); 
        list.add("Paras"); 
        list.add("Arya"); 
        list.add("Bijal"); 
  
        System.out.println("LinkedList: "+ list); 
        ArrayList<String> newList = new ArrayList<String>();
        newList.addAll(list);
        System.out.println("ArrayList: "+ list); 
    } 
	
}

