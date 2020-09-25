
import java.util.Scanner;

public class Q18 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your String: ");
			String str = sc.nextLine();
			
			int n = str.length(); 
			StringBuilder newString = new StringBuilder();
			for (int i = 0; i < n; i++) {  
				int count = 1; 
				while (i < n - 1 && 
					str.charAt(i) == str.charAt(i + 1)) { 
					count++; 					
					i++; 
				}
			    String str1 = Integer.toString(count); 
			    newString.append(str.charAt(i)+ str1);
			}

			if(newString.length()<str.length()){
				System.out.println(newString);
			}
			else if(newString.length()>str.length()){
				System.out.println(str);
			}
			else {
				System.out.println("Both are same in length "+ str +" and "+ newString);
			}
		}
		
	}

}
