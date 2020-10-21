//check given string is pallindrome

package Package1;

public class StringPallindrome {

	public static void main(String[] args) {
			
		/*
		 * String s="nayan"; String reverse ="";
		 * 
		 * for (int i = s.length()-1; i >= 0; i--) {
		 * 
		 * reverse=reverse+s.charAt(i); }
		 * 
		 * if(reverse.equals(s)) {
		 * 
		 * System.out.print("Given string is "+s+" pallindrome"); }else {
		 * System.out.print("Given string is "+s+" not pallindrome"); }
		 */
		
		String s="ankit";
		String p="";
		for (int i = s.length()-1; i >= 0; i--) {
			
			p=p+s.charAt(i);
			
		}
		//System.out.println(p);
		if(s.equals(p)) {
			System.out.println("palind");
		}
		
	}
	}
