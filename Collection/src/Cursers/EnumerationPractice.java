/* if we want object 1 by 1 from collection then we should go for cursors.
 * Enumeration : 1) we can use Enumeration for getting objects 1 by 1 from legacy class.
  				 2) we can create enumeration object by using element methods of vector class.	
  	Two methods : booleans hasMoreElement();
  				  object nextElement();	
  	Limitation : 1) Apply only on legacy classes
  				 2) we can get only read access
*/

package Cursers;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationPractice {
	
	public static void main(String[] args) {
	
	Vector v=new Vector();
	
	/*v.add(1);
	v.add(2);
	v.add(3);
	v.add(4);
	v.add(5);
	v.add(6);
	v.add(7);
	v.add(8);
	v.add(9);
	v.add(10);*/
	
	for (int i = 0; i <=10; i++) {
		v.addElement(i);
	}
	System.out.println(v);
	Enumeration e1=v.elements();
	
	while(e1.hasMoreElements()) {
		Integer I=(Integer) e1.nextElement();
		if(I%2==0) {
		System.out.println(I);
		}
	}

	}

}
