package oops;

public class Encapsulation {
	// encapsulation is that it is a protective shield that prevents the data from being accessed by the code outside this shield.
	
	/*
	 * make the attributes private and those can be accessed by public methods only -> getters and setters
	 *  prevents unauthorized access and modification, making the ATM system more secure and robust.
	 *  
	 *  The ATM has private data like account balances, user PINs, transaction history, etc.
These data are not directly accessible by users or external systems. Instead, they are encapsulated within the ATM's software.
	 * 
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setName("Reena");
		p1.setAge(26);
		System.out.println("Name: "+ p1.getName() + "\nAge: "+ p1.getAge()); 
	}

}

class Person{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}


class ATM {
    // Private attributes
    private double balance;
    private int pin;

    // Constructor
    public ATM(double initialBalance, int pin) {
        this.balance = initialBalance;
        this.pin = pin;
    }

    // Private method to validate PIN
    private boolean validatePin(int inputPin) {
        return this.pin == inputPin;
    }

    // Public method to get balance
    public double getBalance(int inputPin) {
        if (validatePin(inputPin)) {
            return this.balance;
        } else {
            System.out.println("Invalid PIN");
            return -1;
        }
    }

    // Public method to withdraw cash
    public String withdrawCash(double amount, int inputPin) {
        if (validatePin(inputPin)) {
            if (amount <= this.balance) {
                this.balance -= amount;
                return "Withdrawn: $" + amount;
            } else {
                return "Insufficient balance";
            }
        } else {
            return "Invalid PIN";
        }
    }

    // Public method to deposit cash
    public String depositCash(double amount, int inputPin) {
        if (validatePin(inputPin)) {
            this.balance += amount;
            return "Deposited: $" + amount;
        } else {
            return "Invalid PIN";
        }
    }
}
