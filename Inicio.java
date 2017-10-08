package BankMonitor;

public class Inicio {

	public static void main(String[] args) {
		
		Cuenta c = new Cuenta();
		Cajeros cj = new Cajeros("Person 1", c);
		Cajeros cj2 = new Cajeros("Person 2", c);
		Cajeros cj3 = new Cajeros("Person 3", c);
		Cajeros cj4 = new Cajeros("Person 4", c);
		
		c.setSaldo(1000);
		
		cj.start();
		cj2.start();
		cj3.start();
		cj4.start();
			
		
		

	}

}
