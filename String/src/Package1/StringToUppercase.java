// confusion only a and b capital
package Package1;

public class StringToUppercase {
	
	public static void main(String[] args) {
		String s=new String("ankit bhore");
		
		/*System.out.println(s.charAt(2));
		System.out.println(s.indexOf(2));
		System.out.println(s.toUpperCase());
		System.out.println(s.trim().substring(2));
		System.out.println(s.trim().substring(7));
		System.out.println(s.substring(2, 6))*/;
		String[] a=s.split("n");
		System.out.println(a);
		for(String s1:a) {
		System.out.println(s1);
		
		}
		/*char chars[] = {'a', 'b', 'c'};
        String str = new String(chars);
        System.out.println(str);*/
		
		
		
		
	}

}
