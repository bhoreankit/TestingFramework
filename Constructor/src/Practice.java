
public class Practice {
	
	String name;
	int salary;
	
	private  Practice (String name, int salary){
		this.name=name;
		this.salary=salary;
		
	}
	public void Display() {
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		
		Practice p=new Practice("nakul",3000);
		
		p.Display();
		
		
	}

}
