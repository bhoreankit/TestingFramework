package Package1;
//add all elements to array single digit addition
public class Practice {

	public static void main(String[] args) {
		
		int[] a= {2,3,1,6};
		
		int count=0;
		
		for (int i = 0; i < a.length; i++) {
			
			count=count+a[i];
		}
		
		System.out.println(count);
		
	}

}
