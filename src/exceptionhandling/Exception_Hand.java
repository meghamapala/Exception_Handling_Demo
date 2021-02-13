package exceptionhandling;

public class Exception_Hand {

		
		String address;
		int num;
		
		public Exception_Hand() {}
		
		public Exception_Hand(String address) {
			this.address=address;
			System.out.println(address);
		}
		
		public String myHouse(String address) {
			String where=address;
			return where;
		}
		
		public void setAddress(String address) {
			this.address=address;
		}
		
		public void displayAddress() {
			System.out.println(this.address);
		}
		
		
		
		

}
