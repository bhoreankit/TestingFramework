package fb;

public class ThroDemo {

	public void m1() {
		int age=17;
		
		if(age<18) {
			
			throw new AgeNotFoundException(); 
		}else {
			
			System.out.println("you are adult");
		}

	}
	public static void main(String[] args) {
		ThroDemo t=new ThroDemo();
		t.m1();
		
	}
	
}
