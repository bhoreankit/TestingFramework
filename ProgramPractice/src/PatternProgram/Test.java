package PatternProgram;

public class Test {
	
	public static void main(String[] args) {
		int m=1;
		 char n='a'; 
		
		for(int i = 1; i <= 4; i++) {
			for (int j = 3; j >=i  ; j--) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i; k++) {
				
				if(i%2!=0) {	
					System.out.print(m+" ");
					
				}else {
					System.out.print(n+" ");
					
				}
				m++;
				n++;
				
			}
			System.out.println();
		}

	}


}