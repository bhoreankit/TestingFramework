import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinklistPractice {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		 l.add("Steve");
	     l.add("Carl");
	     l.add("Raj");
	     l.addFirst("Negan");
	     l.addLast("Negan");
	     l.add(1, "Ankit");
	     System.out.println(l);
	     /*int num=0;
	     while(l.size()>num) {
	    	 System.out.println(l.get(num));
	    	 num++;
	     }*/
	     l.toArray();
	     //System.out.println(l);
	}

}
