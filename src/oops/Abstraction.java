package oops;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle("Red", 4);
		System.out.println(c1.toString());
	}

}

abstract class Shape{
	String color;
	abstract double area();
	public abstract String toString();
	public Shape(String color) {
		System.out.println("Shape constructor is called");
		this.color= color;
	}
	public String getColor() {
		return this.color;
	}
}
class Circle extends Shape{
	double radius;
	public Circle(String color, double radius) {
		super(color);
		this.radius= radius;
		
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI* Math.pow(radius, 2);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle color is "+ super.getColor() + "  and area is "+ area();
	}
}

/*
 * Data Abstraction is the property by virtue of which only the essential details are displayed to the user.
 * Consider a real-life example of a man driving a car. The man only knows that pressing the accelerators
 *  will increase the speed of a car or applying brakes will stop the car,
 *  but he does not know how on pressing the accelerator the speed is actually increasing, he does not know about the inner mechanism of the car or the implementation of the accelerator, brakes, etc in the car. This is what abstraction is. 
 * Encapsulation is data hiding(information hiding) while Abstraction is detailed hiding(implementation hiding).
 *
 * It reduces the complexity of viewing things.
Avoids code duplication and increases reusability.
Helps to increase the security of an application or program as only essential details are provided to the user.
It improves the maintainability of the application. 
It improves the modularity of the application. 
The enhancement will become very easy because without affecting end-users we can able to perform any type of changes in our internal system. 
Improves code reusability and maintainability.
Hides implementation details and exposes only relevant information.
Provides a clear and simple interface to the user.
Increases security by preventing access to internal class details.
Supports modularity, as complex systems can be divided into smaller and more manageable parts.
Abstraction provides a way to hide the complexity of implementation details from the user, making it easier to understand and use.
Abstraction allows for flexibility in the implementation of a program, as changes to the underlying implementation details can be made without affecting the user-facing interface.
Abstraction enables modularity and separation of concerns, making code more maintainable and easier to debug.

 
Disadvantages of Abstraction in Low Level Design:

Abstraction can make it more difficult to understand how the system works.
It can lead to increased complexity, especially if not used properly.
May limit the flexibility of the implementation.
Abstraction can add unnecessary complexity to code if not used appropriately, leading to increased development time and effort.
Abstraction can make it harder to debug and understand code, particularly for those unfamiliar with the abstraction layers and implementation details.
Overuse of abstraction can result in decreased performance due to the additional layers of code and indirection.
 * */
 