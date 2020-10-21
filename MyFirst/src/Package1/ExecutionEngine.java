package Package1;

public class ExecutionEngine {

	public static void main(String[] args) {
		
		/*TwoWheeler t=new TwoWheeler();
		t.SetMaxSpeed(60);*/
		
		

		
	for(int i=1; i<=153; i++) {
		
		int armstrong=0;
		int temp=i;
		 int rem;
		while(temp>0) {
			rem=temp%10;
			temp=temp/10;
			armstrong=armstrong+(rem*rem*rem);
			
		}
		
		if(armstrong==i) {
			
			System.out.println(armstrong+" ");
		}
		
		
		
	}	
		
		
		

	}

}
