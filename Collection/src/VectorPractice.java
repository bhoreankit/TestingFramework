import java.util.*;
public class VectorPractice {

	public static void main(String[] args) {
		Vector v=new Vector();
		
		v.add("Ankit");
		v.add("Bhore");
		v.add(12);
		v.add(null);
		v.add('a');
		v.add("Pune");
	
		/*v.size();
		System.out.println(v);
		System.out.println(v.capacity());
		v.ensureCapacity(11);
		System.out.println(v.capacity()); 
		Enumeration e1=v.elements();
		while(e1.hasMoreElements()) {
			
			System.out.println(e1.nextElement());
		}*/
		
		int[] a= {1,2,3,4,5,7,8,9,10};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		int sum1=0;
		for (int j = 1; j <= 5; j++) {
			sum1=sum1+j;
		}
		System.out.println(sum1);
	}
}
