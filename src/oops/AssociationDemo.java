package oops;

import java.util.HashSet;
import java.util.Set;

public class AssociationDemo {
/* Association-> relation between two classes where one class use another
*  relation between separate classes which is achieved by their objects
*  can be one-to-one, one-to-many, many-to-one, many-to-many
*  
*  below example shows that
*  bank can have many employees-> so it is a one to many relationship
*  
*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Harry");
		Employee e2 = new Employee("John");
		Set<Employee> employees= new HashSet();
		employees.add(e1);
		employees.add(e2);
		Bank bank = new Bank("ICICI");
		bank.setEmployees(employees);
		for(Employee emp: bank.getEmployees()) {
			System.out.println(emp.getEmpName() +" is from bank "+ bank.getBankName());
		}
	}

}

class Bank{
	private String bankName;
	private Set<Employee> employees;
	public Bank(String bankName) {
		this.bankName=bankName;
	}
	public String getBankName() {
		return this.bankName;
	}
	
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	
}

class Employee{
	private String empName;
	public Employee(String name) {
		this.empName=name;
	}
	public String getEmpName() {
		return this.empName;
	}
	
}
