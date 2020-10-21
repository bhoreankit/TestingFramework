import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class Descendingarraylist {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("nayan");
		l.add("sagar");
		l.add("pankaj");
		l.add("nitin");
		l.add("ankit");
		
		Collections.sort(l); //for sorting
		System.out.println(l);
		ListIterator li=l.listIterator();
		while(li.hasNext()) {
			li.next();
		}
		while(li.hasPrevious()) {
			System.out.print(li.previous()+" ");
		}
		
	
	}

}
