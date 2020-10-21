package ToStringMethod;

public class Student {
		String name;
		int id;
		
		Student(String name, int id){
			
			this.name=name;
			this.id=id;
		}
		
		public String toString() {
			
			return "String";
		}
		
	public static void main(String[] args) {

		Student s=new Student("Ankit", 101);
		Student s1=new Student("Pavan", 102);
		
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s1);
		
		String s2=new String("Munnaa");
		
		System.out.println(s2);
		
		Integer I=new Integer(10);
		
		System.out.println(I);
		
	}

}
