package exceptionhandling;

public class LapTop extends Computer{
	
	public LapTop() {
		super(8);
		System.out.println(ramSize);
	}
	
	public void displaySize() {
		super.assembledComputer();
		super.assembledLapTop();
	}

}
