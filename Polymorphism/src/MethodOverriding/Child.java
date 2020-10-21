package MethodOverriding;

public class Child extends Parent{
	
	float show() {
		
		System.out.println("I am in Child class");
		
		return 0;
	}

	public static void main(String[] args) {
		
		Child c=new Child();
		
		c.show(7);
		
		//Parent p=new Parent();
		
		//p.show();
		
		
	}

}
