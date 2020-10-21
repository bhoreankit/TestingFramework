
public class Test {
	
	public static void main(String[] args) {
		
		/*int age=15;
		if(age<18) {
			
			throw new YoungerAgeException("you are not eligible to vote"); 
			
		}else {
			
			System.out.println("vote successfully");
		}*/
		
		try {
			int a=10/0;
			System.out.println(a);
			System.exit(0);
		}catch(Exception e) {
			System.out.println(23);
		}finally {
			System.out.println(24);
								
		}		
}
	
}
 