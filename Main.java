package Assignments;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee(1,"Peter Doe",37534.55);
		Employee e2= new Employee(2,"John Doe",40345.55);
		Employee e3= new Employee(3,"Sam",36567.88);
		List<Employee> e = new LinkedList<Employee>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		for(Employee employee:e) {
			employee.displayDetails();
		}
	}

}
