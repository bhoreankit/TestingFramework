import java.util.ArrayList;

public class EvenOddarraylist {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);

		ArrayList l1 = new ArrayList();
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(10);
		int temp;
		for (int i = 0; i < l.size(); i++) {
			int i1 = (Integer) l.get(i);
			if (i1 % 2 != 0) {

				for (int j = 0; j < l1.size(); j++) {
					int j1 = (Integer) l1.get(j);
					if (j1 % 2 == 0) {

						temp = j1;
						j1 = i1;
						i1 = temp;
					}

				}

			}

		}
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		for (int j = 0; j < l1.size(); j++) {
			System.out.println(l1.get(j));
		}
		
	}
	

}
