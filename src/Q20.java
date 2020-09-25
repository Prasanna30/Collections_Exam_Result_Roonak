import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Q20 {
	int romanToInt(String s) 
    { 
        // Create a empty hash map. 
        HashMap<Character, Integer> map = new HashMap<>(); 
  
        // Putting value in hash map. 
        map.put('I', 1); 
        map.put('V', 5); 
        map.put('X', 10); 
        map.put('L', 50); 
        map.put('C', 100); 
        map.put('D', 500); 
        map.put('M', 1000); 
  
        int result = 0; 
        for (int i = 0; i < s.length(); i++) {
            if (i > 0
                && map.get(s.charAt(i)) 
                       > map.get(s.charAt(i - 1))) { 
                result += map.get(s.charAt(i)) 
                          - 2 * map.get(s.charAt(i - 1)); 
            } 
            else { 
                result += map.get(s.charAt(i)); 
            } 
        } 
        return result; 
  
    } 
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Roman number: ");
        String s = sc.next(); 
        Q20 obj = new Q20(); 
        System.out.println("Your integer value is "+obj.romanToInt(s));
    } 
}
