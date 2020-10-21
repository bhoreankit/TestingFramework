package Package1;

public class CapitalizeFirstWord {

	public static void main(String[] args) {
		String s = "i love india";
		
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {

			if (i == 0) {

				if (chars[i] >= 'a' && chars[i] <= 'z') {
					chars[i] = (char) (s.charAt(i) - 32);
				}
			} else if (chars[i] == ' ') {
				if (chars[i] >= 'a' && chars[i] <= 'z') {
					chars[i + 1] = (char) (s.charAt(i + 1) - 32);

				}

			}
			
		}
		s = new String(chars);
		System.out.println(s);
		StringBuffer sb=new StringBuffer();
		StringBuilder sb1=new StringBuilder();
		
	}

}
