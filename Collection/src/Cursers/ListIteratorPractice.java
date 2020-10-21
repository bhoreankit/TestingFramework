/*Can move both forward and backward direction.
 * can apply replacement, addition of new object In addition of read and remove operation.
 * following methods : hasNext(), Next(), NextIndex(), hasPrevious(), hasPrevious(), previousIndex(), remove(), add(Object o), set(Object 0);

*/
package Cursers;

import java.util.ListIterator;
import java.util.*;

public class ListIteratorPractice {

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<>();
		l.add("Balkrishna");
		l.add("Venki");
		l.add("Chiru");
		l.add("Nag");

		ListIterator<String> ltr = l.listIterator();
		while (ltr.hasNext()) {
			String s = (String) ltr.next();
			if (s.equals("Venki")) {
				ltr.remove();
			} else if (s.equals("Nag")) {
				ltr.add("Chaitu");
			} else if (s.equals("Chiru")) {
				ltr.set("charan");
			}

		}
		System.out.println(l);
	}

}
