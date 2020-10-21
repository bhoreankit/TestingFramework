package Package1;

import java.util.Scanner;

public class SwapTwoStringVariables {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.argsin);
		System.out.println("Enter the string");
		*/
		String s1="Ankit";
		String s2="Bhore";
		
		s2=s1.concat(s2);
		/*s1=s1.substring(5, 10);
		System.out.println(s1);*/
		
		s1=s2.substring(5);
		System.out.println(s1);
		s2=s2.substring(0, 5);
		System.out.println(s2);
		
	}

}
