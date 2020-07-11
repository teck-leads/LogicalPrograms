package javaApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		  Employee e1 = new Employee(1, "madhav", "anupoju", 24, 1000l);
	        Employee e2 = new Employee(2, "teja", "siddhanadham", 25,2788l);
	        Employee e3 = new Employee(3, "zDill", "anupoju", 27,8989l);
	        Employee e4 = new Employee(4, "ram", "zLastName", 24,78878l);
	 System.out.println("original insertion order");
	        List<Employee> employees = new ArrayList<Employee>();
	        employees.add(e2);
	        employees.add(e3);
	        employees.add(e1);
	        employees.add(e4);
	        
	        employees.forEach(System.out::println);
	        
	        Collections.sort(employees);
	        System.out.println("sorted by name by implementing Comparable");
	        employees.forEach(System.out::println);
	        
	}

}
