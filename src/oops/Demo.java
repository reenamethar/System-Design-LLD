package oops;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child();
		Parent p1 = new Parent();
		p1.staticMethods();
	}
}

class Parent{
	public int size=10;
	public Parent() {
		System.out.println("Parent constructor is called");
	}
	public  void staticMethods() {
		System.out.println("static method");
	}
}

class Child extends Parent{
	public Child() {
		System.out.println("Child Constructor is called");
	}
}
