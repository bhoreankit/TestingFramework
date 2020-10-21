
package AbstractAndInterface;

public class Simple extends B{
	 int c;
	

	public Simple(int x) {      //confusion
		super(x);
	}
		
	{
		c=10;
		System.out.println("I am static block of simple class "+c);
	}

	public static void main(String[] args) {
		//Simple s=new Simple(6);
		
		B b=new B(30);
		/*
		//b.show();			
		b.normal();
		b.interfaceMethod1();
		b.m1();
		
		I2.ankit();
		System.out.println(I1.b);
		b.interfaceMethod3();*/
	}

	
}
