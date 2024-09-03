package oops;

public class Inheritance {
/*
 * Inheritance allows subclasses to reuse code from their superclasses, promoting code reuse 
 * inherit properties and behaviors (methods) from another class. 
 * 
 * Inherited below
 *Public methods and fields are inherited and accessible.
 *Protected methods and fields are inherited and accessible within the subclass and other classes in the same package.
 *Methods and fields with no access modifier (default) are inherited but only accessible within the same package.
 *
 *Not inherited
 *Private methods and fields are not inherited. They are only accessible within the class they are declared in.
 *Constructors are not inherited. However, the subclass can call the superclass constructor using super().
 *  
 * */	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(2, 20, 1);
		System.out.println(mb.toString());
		mb.applyBrake(2);
		System.out.println(mb.toString());
		mb.applyBrake(3);
		System.out.println(mb.toString());
	}

}

class Bicycle{
	public int gear;
	public int speed;
	public Bicycle(int gear, int speed) {
		System.out.println("Parent const called");
		this.gear = gear;
		this.speed = speed;
	}
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	public void speedUp(int increment) {
		speed += increment;
	}
	@Override
	public String toString() {
		return "No. of gears are " + gear + " and speed of the bicycle is " + speed;
	}
}

class MountainBike extends Bicycle{
	public int seatHeight;
	public MountainBike(int gear, int speed, int seatHeight ) {
		super(gear, speed);
		System.out.println("child class called");
		this.seatHeight = seatHeight;
	}
	@Override
	public String toString() {
		return super.toString() + " and seat height is " + seatHeight;
	}
}


/*
 * Need?
 * 1. Code Reusability
 * 2. Method Overriding
 * 
 * -----
 * Java does not support multiple inheritance directly (a class cannot inherit from more than one class) due to the diamond problem. 
 * However, multiple inheritance can be achieved using interfaces.
 * interface do not have implementation
 *  In cases where default methods in interfaces create ambiguity, the implementing class must explicitly override the conflicting method and can choose to call one of the default implementations using InterfaceName.super.methodName().
 *
 *Abstraction: Inheritance allows for the creation of abstract classes that define a common interface for a group of related classes. This promotes abstraction and encapsulation, making the code easier to maintain and extend.
 * 
 * */