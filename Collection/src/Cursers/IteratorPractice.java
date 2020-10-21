/* can apply any collection object i.e Universal cursor
 * can access only read operation and remove operation
 * both enumeration and iterator move only forward direction
 * we can create Iterator object by using iterator method.
 * Iterator it=c.iterator();  c->any collection object
 * Three methods :  hasNext(),  next(), remove()
 */

package Cursers;
import java.util.Iterator;
import java.util.*;
public class IteratorPractice {

	public static void main(String[] args) {
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		
		Object[] a=l.toArray();
		
		for(Object o: a) {
			System.out.println(o);
		}
		
		
		
	}
}
