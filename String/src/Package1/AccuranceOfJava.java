package Package1;

public class AccuranceOfJava {
	

	public static void main(String[] args) {
		String s=new String("java language is for selenium. java good. java bad java");
		String[] temp=s.split(" ");
		String word="java";
		int count=0;
		for (int i = 0; i < temp.length; i++) {
			if(word.equals(temp[i])) {
				count++;
			}
		}
		System.out.println(count);
		
		
	}

}