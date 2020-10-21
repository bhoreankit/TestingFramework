package AbstractAndInterface;

public interface I1 extends I2 {

	void interfaceMethod1();
		
	default void m1() {
		
		System.out.println("I am default concrete methods in interface I1");
	}
	
	

}
