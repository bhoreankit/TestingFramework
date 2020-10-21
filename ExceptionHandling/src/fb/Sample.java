package fb;

import java.io.IOException;

public class Sample {
	public void m2() {
		TestStack s=new TestStack();
		try {
			s.m1();
		} catch (IOException e) {
			
			System.out.println("Exception is handeled");
		}
		System.out.println("contineu m2 method");
	}

}

