package com.java.inheri;

public class Main {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.m2();
		
		
		Parent parent2 = new Child();
		parent2.m2();
		
		//Child child = new Parent();    CTE
		
		Child child = new Child();
		child.m1();
		child.m2();
		
		
		

	}

}
