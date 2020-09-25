import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class NameSorter implements Comparator<EmployeeEX>{
	@Override
	public int compare(EmployeeEX o1, EmployeeEX o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class IDSorter implements Comparator<EmployeeEX>{
	@Override
	public int compare(EmployeeEX o1, EmployeeEX o2) {
		return o1.getAge() - o2.getAge();
	}
}

class SalarySorter implements Comparator<EmployeeEX>{
	@Override
	public int compare(EmployeeEX o1, EmployeeEX o2) {
		return o1.getSalary() - o2.getSalary();
	}
}

class JoinDateSort implements Comparator<EmployeeEX>{
	public int compare(EmployeeEX o1, EmployeeEX o2) {
		return o1.getJoiningDate() - o2.getJoiningDate();
	}
	
}

class EmployeeEX implements Comparable<EmployeeEX> {
    private int id = -1;
    private String Name = null;
    private int salary= -1;
    private int age = -1;
    private int joiningDate = -1;
 
    public EmployeeEX(int id, String Name, int salary, int age, int join) {
        this.id = id;
        this.Name = Name;
        this.salary = salary;
        this.age = age;
        this.joiningDate = join;
    }
 
    @Override
    public int compareTo(EmployeeEX o) {
        return this.age - o.age;
    }
 
    // Setters and Getters
    @Override
    public String toString() {
        return "Employee : " + id + " - " + Name + " - " + salary + " - " + age +  " - "+ joiningDate+ "\n";
    }
	public int getId() {
		return id;
	}

	public String getName() {
		return Name;
	}

	public int getSalary() {
		return salary;
	}

	public int getJoiningDate() {
		return joiningDate;
	}

	public int getAge() {
		return age;
	}
}

public class Q17{
	public static void main(String args[]) { 
	 EmployeeEX e1 = new EmployeeEX(1, "aTestName", 2000, 34, 10);
     EmployeeEX e2 = new EmployeeEX(2, "nTestName", 3000, 30, 12);
     EmployeeEX e3 = new EmployeeEX(3, "kTestName", 1000, 31, 02);
     EmployeeEX e4 = new EmployeeEX(4, "dTestName", 5000, 25, 11);

     List<EmployeeEX> employees = new ArrayList<EmployeeEX>();
     employees.add(e2);
     employees.add(e3);
     employees.add(e1);
     employees.add(e4);

     // UnSorted List
     System.out.println(employees);
     Collections.sort(employees);
     // Default Sorting by employee Age
     System.out.println(employees);
   //Sorted by FirstName
     Collections.sort(employees, new NameSorter());
     System.out.println(employees.toString());
     //Sorted by Salary
     Collections.sort(employees, new SalarySorter());
     System.out.println(employees);
     // Sorted by ID
     Collections.sort(employees, new IDSorter());
     System.out.println(employees);
     //Sorted by Joining Data
     Collections.sort(employees, new JoinDateSort());
     System.out.println(employees);
 }

}
