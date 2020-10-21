package AbstractAndInterface;

//class extends interface - confusion

public abstract class A implements I1{
	
	int a;
	abstract void show();
	
	public void normal() {
		
		System.out.println("I am normal method");
	}
	
	static{
		
		System.out.println("I am static block in class A");	
	}
	
	public A(int x){   //confusion
		
		this.a=x;
		System.out.println(a);
		
	}
	
	public A() {
		
	}
	
	public void interfaceMethod1() {
		
		System.out.println("I am interfacemethod1");
	}
	
	public void interfaceMethod2() {
		System.out.println("I am interfacemethod2");		
	}
	
	public void interfaceMethod3() {
		System.out.println("I am interfacemethod3");
		
	}
	

}