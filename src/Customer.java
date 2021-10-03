//demo for toString method
public class Customer {
	//instance VAR
	String name;
		
	//constructor
	public Customer(String name) {
		this.name = name;
	}
	
	//return name of constructor 
	public String toString() {
		return this.name;       //to be printed
	}
	
	public static void main(String[] args) {
		Customer c =  new Customer("Adina");
		System.out.println("c = " + c);  //Customer c into a string, calling to toString method 
		
	}

}
