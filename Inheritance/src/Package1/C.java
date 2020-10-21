package Package1;

public class C{
	
	public  void b1() {
		
		System.out.println("I am static b1 method in class C");
	}
	
	public static void main(String[] args) {
		
		/*C c=new C();
		c.b1();*/
		
		A a=new B();
		a.show();
		
	}

}
