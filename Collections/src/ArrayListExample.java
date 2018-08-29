import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> obj = new ArrayList<String>();
		
		obj.add("first");
		obj.add("two");
		obj.add("3");
		
	    for (String string : obj) {
			System.out.println(string);
		}
		obj.add(0, "zero");
		for (String string : obj) {
			System.out.println(string);
		}
	
	
	Employee emp1 = new Employee("blr", 01, 2.000);
	Employee emp2 = new Employee("blr1", 02, 2.000);
	Employee emp3 = new Employee("blr2", 03, 2.000);

	 List<Employee> empList = new ArrayList<Employee>(3);
	 
	 empList.add(emp1);
	 empList.add(emp2);
	 empList.add(emp3);
	 for (Employee string1 : empList) {
			System.out.println(string1);
		}
	 
	 Employee emp12 = new Employee("blr", 01, 21.000);
	 
	 empList.add(2, emp12);
	 for (Employee string1 : empList) {
			System.out.println(string1);
		}
	 
	}
}
