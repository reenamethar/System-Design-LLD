package oops;

import java.util.ArrayList;
import java.util.List;

public class CompositionDemo {
/*
 * Composition is a restricted form of Aggregation in which two entities are highly dependent on each other.  

It represents part-of relationship.
In composition, both entities are dependent on each other.
When there is a composition between two entities, the composed object cannot exist without the other entity.
 *
 * 
 * In below example A company have a number of departments
 * all departments are part of the company
 * if company gets destroyed then all departments within that company will be destroyed
 * that’s why it is composition. Department is Part-of Company.
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company com = new Company("Tech ABC");
		com.addDepartment(new DepartmentClass("Finance"));
		com.addDepartment(new DepartmentClass("HR"));
		com.addDepartment(new DepartmentClass("Operations"));
		com.addDepartment(new DepartmentClass("Engineering"));
		int d = com.getNoOfDepartment();
		System.out.println("Total Number of departments are "+ d);
		System.out.println("Department Names: ");
		for(DepartmentClass dep: com.getDepartments()) {
			System.out.println("-"+ dep.getDepartmentName());
		}
	}

}
class DepartmentClass{
	private String departmentName;
	public DepartmentClass(String deptName) {
		this.departmentName=deptName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	
}

class Company{
	private String companyName;
	private List<DepartmentClass> departments;
	public Company(String name) {
		this.companyName=name;
		this.departments= new ArrayList<DepartmentClass>();
	}
	public void addDepartment(DepartmentClass d) {
		departments.add(d);
	}
	public String getCompanyName() {
		return companyName;
	}
	public List<DepartmentClass> getDepartments() {
		return departments;
	}
	public int getNoOfDepartment() {
		return departments.size();
	}
}
