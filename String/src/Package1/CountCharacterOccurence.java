package Package1;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		String string = new String("Hi i am ankit");

		/**
		 * Using loop
		 * 
		 * char ch='a';
		 * 
		 * int count=0; for (int i = 0; i < string.length(); i++) {
		 * if(ch==(string.charAt(i))) {
		 * 
		 * count++; 
		 * 
		 * } } System.out.println(count);
		 */
		
		/* Without using loop
		 * char ch='a';
		int count=(string.length())-(string.replace("a", "").length());
		System.out.println(count);*/
		
	}

}
