import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class FirstNameSorter implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
}

class Employee implements Comparable<Employee> {
    private int id = -1;
    private String firstName = null;
    private String lastName = null;
    private int age = -1;
 
    public Employee(int id, String fName, String lName, int age) {
        this.id = id;
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }
 
    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
 
    // Setters and Getters
    @Override
    public String toString() {
        return "Employee : " + id + " - " + firstName + " - " + lastName + " - " + age + "\n";
    }

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}
}

public class Q9{
	public static void main(String args[]) { 
	 Employee e1 = new Employee(1, "aTestName", "dLastName", 34);
     Employee e2 = new Employee(2, "nTestName", "pLastName", 30);
     Employee e3 = new Employee(3, "kTestName", "sLastName", 31);
     Employee e4 = new Employee(4, "dTestName", "zLastName", 25);

     List<Employee> employees = new ArrayList<Employee>();
     employees.add(e2);
     employees.add(e3);
     employees.add(e1);
     employees.add(e4);

     // UnSorted List
     System.out.println(employees);
     Collections.sort(employees);
     // Default Sorting by employee id
     System.out.println(employees);
     
     Collections.sort(employees, new FirstNameSorter());
     //Sorted by FirstName
     System.out.println(employees);
 }

}