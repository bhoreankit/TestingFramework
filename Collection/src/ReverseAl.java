import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseAl {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Ankit");
		l.add("Bhore");
		l.add("Morshi");
		l.add(2);
		l.add('a');
		
		/** Using loop*
		 for (int i = (l.size()-1); i > 0; i--) {
		System.out.println(l.get(i));
		}*/
		
		/** Using Method*
		  Collections.reverse(l);
		System.out.println(l);*/
		
		/** using listIterator*
		  ListIterator li=l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}*/
		
	}

}


