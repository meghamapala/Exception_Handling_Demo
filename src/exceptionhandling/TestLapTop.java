package exceptionhandling;

public class TestLapTop {

	public static void main(String[] args) {
		
		LapTop laptop = new LapTop();
		laptop.assembledComputer();
		laptop.assembledLapTop();
		laptop.displaySize();
		
		Exception_Hand dd=new Exception_Hand();
		dd.myHouse("HillSide");
		dd.setAddress("Kensas");
		dd.displayAddress();
		
		Exception_Hand ddd1=new Exception_Hand("Florida");
	    
		Exception_Hand ddd=new Exception_Hand("Union");
		
		Exception_Hand ddd2=new Exception_Hand("Union");
		
		Computer sss=new Computer(8);
		


	}

}
