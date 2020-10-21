package MethodOverriding;

public class Bike extends Vehicle{
	
		public void run() {
			
			System.out.println("I am also running");
		}
	public static void main(String[] args) {
		
		Bike b=new Bike();
		
		b.run();

	}

}
