import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ArrayListPractice {

	public static void main(String[] args) {
		
       // Mycomparatable c = new Mycomparatable();
		//TreeSet<Integer> l=new TreeSet<Integer>(new Mycomparatable());//create empty constructor
		ArrayList l=new ArrayList();
		//l.ensureCapacity(20);
		l.add(10);
		l.add(9);
		l.add(7);
		l.add(0);
		l.add(3);
		l.add(10);
		l.add(16);
		l.add(2);
		l.add(10);
		l.add(9);
		
		LinkedHashSet s=new LinkedHashSet(l);
		
		System.out.println(s);
		
		
		
	}	
	/*Collections.reverse(l);  // Reverse arrayList
		System.out.println(l);
		
		Iterator it=l.iterator(); //Iterate by using Iterator
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		 1
		 for (Object ob: l) {  //Iterate by using foreachloop
			System.out.println(ob);
		} 
		
		ListIterator li=l.listIterator(); // Iterate by using ListIterator
		while(li.hasNext()) {
			System.out.println(li.next());
		} 
		
		ArrayList l1=new ArrayList();
		
		l1.add("new");
		l1.add("Arraylist");
		
		l.addAll(l1);
		
		l.retainAll(l1);
		System.out.println(l);*/
		
		/* System.out.println(l.isEmpty());
		System.out.println();
		System.out.println(l.contains(null));
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));	
		}
		System.out.println(l.indexOf(10));
		System.out.println(l.lastIndexOf(10));
		System.out.println(l.indexOf(2));
		
		Object[] ob=l.toArray();
		for (Object ob1:ob) {
			System.out.println(ob1);
		}
		System.out.println(l.get(2));
		System.out.println(l.set(5, 12));
		System.out.println(l.remove(6));
		//l.clear();
		System.out.println(l);
		
		
		ArrayList l1=new ArrayList();
		
		l.add(22);
		l.add("pavan");
		l.add("munna");
		
		l.addAll(l1);
	
		System.out.println(l);//join two Arraylist  */
		
	}


//new capacity=(new capacity*3/2)+1
/*
Arraylist l=new Arraylist();
Arraylist l=new Arraylist(int initialcapacity);
Arraylist l=new Arraylist(collection c);

*/

