package Assignments;

public class Employee {
	private int id;
	private String name;
	private double Salary;
	
	public Employee(int id,String name,double Salary) {
		this.id=id;
		this.name=name;
		this.Salary=Salary;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return Salary;		
	}
	public void displayDetails() {
		System.out.println("id of emplyoee is:"+ this.getId()+" Name of employee is:-"+ this.getName()+ 
				" Salary of Employee is :"+this.getSalary());
	}
}
