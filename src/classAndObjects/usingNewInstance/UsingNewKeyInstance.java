package classAndObjects.usingNewInstance;

public class UsingNewKeyInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Class.forName in Java is used to dynamically load a class at runtime
			//Dynamically loading a class means loading a class into the Java Virtual Machine (JVM) at runtime instead of at compile time. This allows a Java program to decide which classes to load and use during execution, rather than having all dependencies fixed at the time of compilation.
			Class c = Class.forName("classAndObjects.usingNewInstance.Example"); // throws ClassNotFoundException if class not found
			Example s = (Example)c.newInstance(); // IllegalAccessException if driving class does not have the access of class definition
			// InstantiationException if the class doesn't contain default constructor , as the newInstance() calls the default constructor internally
			s.message();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
class Example{
	void message() {
		System.out.println("Hello Geeks!!");
	}
}
