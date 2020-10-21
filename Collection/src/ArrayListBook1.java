import java.util.ArrayList;

public class ArrayListBook1 {

	public static void main(String[] args) {
		ArrayListBook a1=new ArrayListBook(1,"Flyofwings","Dr.Apj kalam");
		ArrayListBook a2=new ArrayListBook(2,"ThinkPositive","Robert");
		ArrayListBook a3=new ArrayListBook(3,"Polity","Chetan Bhagat");
		
		ArrayList l=new ArrayList();
		l.add(a1);
		l.add(a2);
		l.add(a3);
		
		for(Object b:l) {
		System.out.println(b);
		}
	}

}
