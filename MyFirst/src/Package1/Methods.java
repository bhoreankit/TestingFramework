package Package1;

public class Methods {
	static int result;
	public void add(int i, int j) {
		
		result=i+j;
		result=i*j;
		
	}
	public boolean evenOrOdd(int x) {
			boolean b=false;
			if(x%2==0) {
				b=true;
			}
			return b;	
	}
	public void add(int x[]) {
		int result=0;
		for (int i = 0; i < x.length; i++) {
			result=result+x[i];
		}
		System.out.println(result);
		
	}
	public static void main(String[] args) {
		
		Methods m=new Methods();
		//m.add(100,30);
		m.add(50,100);
		
		boolean isEven=m.evenOrOdd(8);
		if(isEven) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
		
		System.out.println(result);
		int num[]={3,4,5,6};
		
		
	}

}


