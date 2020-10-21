
public class ThrowExample {
	
	
	
	//int stuAge=14, stuWt=41;
	
	static void checkEligibility(int stuAge, int stuWt){
	if(stuAge<18 && stuWt<40) {
		
		
		throw new YoungerAgeException("You are nor eligible to registration");
	}else {
		
		System.out.println("you are eligible");
	}	
	}
	public static void main(String[] args) {
		checkEligibility(12, 20);	
			

}
}