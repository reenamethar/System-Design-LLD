package classAndObjects.usingClone;

public class UsingClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "Rima");
		System.out.println(s1.toString());
		try {
			Student s2 = (Student) s1.clone();
			System.out.println(s2.toString());;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

class Student implements Cloneable{
	int rollNo;
	String name;
	Student(int rollNo, String name){
		this.name = name;
		this.rollNo = rollNo;
	}
	public Object clone() throws CloneNotSupportedException {
		//If Cloneable interface is not implemented, clone() method generates CloneNotSupportedException.
		return super.clone();
	}
	public String toString() {
		return this.name +" " + this.rollNo;
		
	}
	// by default if we dont give implementation for classAndObjects.usingClone.Student@22f71333
}