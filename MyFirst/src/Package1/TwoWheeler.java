package Package1;

public class TwoWheeler extends Vehicle{
	
	public int SetMaxSpeed(int maxSpeed) {
		
		if(maxSpeed > 120) {
			
			System.out.println("Two wheeler speed should not be exceed above 120 kmph");
		
		}else {
			
			Constant.maxSpeed=maxSpeed;
			
		}
		return Constant.maxSpeed;
	}

	
}