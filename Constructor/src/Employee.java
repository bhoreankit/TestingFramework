
public class Employee {
		
	String name;
	int empid;
	
	public Employee(String name,int empid) {
			this.name=name;
			this.empid=empid;
		
		System.out.println(name+" "+empid);
		
			
		}
	
	public static void main(String[] args) {
		Employee e=new Employee("Ankit",101);
		Employee e1=new Employee("munna", 102);
		Employee e3=new Employee("paba", 103);
		
	}

	
	
}