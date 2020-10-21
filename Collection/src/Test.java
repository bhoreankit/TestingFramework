import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList li=new ArrayList();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.ensureCapacity(8);
		
		System.out.println(li);
	}

}
