package MethodOverloading1;

public class Adder {
	
	public void add(int x, int y) {
		int c=x+y;
		System.out.println(c);
	}
	
	public void add(double x, double y) {	
		double c=x+y;		
		System.out.println(c);
	}	
	public void add(int x[]) {
		int c=0;
		for(int i=0; i<x.length; i++) {			
			c=x[i]+c;
		}
		System.out.println(c);
	}
	public static void main(String[] args) {		
		Adder a=new Adder();	
		a.add('a','b');
		a.add(12.6, 12.6);		
		int n[]= {1,2,3,8,8,8};
		a.add(n);
		
	}
	

}
