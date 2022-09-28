package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager=customerManager2;
		//bellekte customer manager türünde bir nesne ürettik
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		//classlar referens tiptir
		

	}
	

}
