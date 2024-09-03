package classAndObjects.usingnew;

public class UsingNewKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog("Bravo", 2);
		Dog d2 = new Dog("Oliver", 3);
		System.out.println(d1.dogName + " " + d1.dogAge);
		System.out.println(d2.dogName + " "+ d2.dogAge);

	}

}

class Dog{
	String dogName;
	int dogAge;
	Dog(String dogName, int dogAge){
		this.dogName= dogName;
		this.dogAge= dogAge;
	}
}
