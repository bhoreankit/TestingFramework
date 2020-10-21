import java.util.Comparator;

public class Mycomparatable implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		
		Integer i1 = (Integer)arg0;
		Integer i2 = (Integer)arg1;
		
		return i1.compareTo(i2);
	}
		
	}
	