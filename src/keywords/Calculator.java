package keywords;

public class Calculator {

	public static void main(String[] args) {
		
		final int number = 10;
		
		try {
			int result = 10/0;
			System.out.println(result);
		}catch(Exception ex) {
			System.out.println("You cannot divide number by Zero");
		}
		System.out.println("You made it.");
        }

}
