import javax.swing.plaf.FontUIResource;

public class DuplicateElementsFind {

	public static void main(String[] args) {

		/*
		 * int[] a= {1,2,3,4,5,6,2,4,1,5};
		 * 
		 * for (int i = 0; i < a.length; i++) {
		 * 
		 * for (int j = i+1; j < a.length; j++) {
		 * 
		 * if(a[i]==a[j]) {
		 * 
		 * System.out.println(a[j]); }
		 * 
		 * }
		 * 
		 * }
		 */

		int[] x = { 1, 2, 3, 1, 6, 2 };
		for (int i = 0; i < x.length; i++) {
			for (int j = 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					System.out.println(x[j]);
				}

			}

		}

	}

}
