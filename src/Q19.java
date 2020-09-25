import java.util.Formatter;
import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		Formatter fo = new Formatter();
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter your data: ");
        String s = sc.nextLine();
//        int p = sc.nextInt();
//        String r = sc.nextLine();
//        int m = sc.nextInt();
//        String r = sc.next();WWW
//        int m = sc.nextInt();
//        String b = String.format("%03d", p);
//        String d = String.format("%03d", m);
        System.out.println("your out out is: ");
//        System.out.println(s +"          "+ b);
//        System.out.println(r +"          "+ d);
        fo.format("|%-20.4f|", s);
	}

}
