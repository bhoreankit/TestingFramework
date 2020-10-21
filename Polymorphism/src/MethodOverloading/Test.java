package MethodOverloading;

public class Test {
	
		private void show(int a, String b) {
			
			System.out.println("int method");
		}
		private void show(String b, int a) {
			
			System.out.println("string method");
		}
	
		public static void main(String[] args) {
			
		
		Test t=new Test();
		t.show(1, "Ankit");
		
		}
		
}
