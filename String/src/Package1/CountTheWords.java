package Package1;

import java.util.Scanner;

public class CountTheWords {
		
	 public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] word=s.split(" ");
		for(String s1:word) {
		System.out.println(s1);
	 }
		System.out.println(word.length);
		 
		/* String s=new String("w3scholsoAnkitjkoebo");
		 
		 char[] ch=s.toCharArray();
		 int count=0;
		 System.out.println("Duplicate Characters are:");
		 for (int i = 0; i < s.length(); i++) {
			 
			for(int j=i+1; j < s.length(); j++) {
				
				if(ch[i]==ch[j]) {
				System.out.print(ch[j]);
					count++;
					break;
				}
			}
			
		}*/
		 	 
	 }
}