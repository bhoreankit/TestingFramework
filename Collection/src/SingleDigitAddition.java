import java.util.ArrayList;

public class SingleDigitAddition {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(1); l.add(2); l.add(10); l.add(10); l.add(2);
		int sum=0;
		
		for (int i = 0; i < l.size(); i++) {
			sum=sum+(Integer)l.get(i);
					
		}
		System.out.println(sum);
		int rem;
		int rev=0;
		int temp=sum;
		while(temp>0) {
			rem=temp%10;
			temp=temp/10;
			rev=rev+rem;
		}
		System.out.println(rev);
		
	}

}
