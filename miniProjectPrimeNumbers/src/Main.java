
public class Main {

	public static void main(String[] args) {
		int number = 23;
		int remainder = number % 2;
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println(" The number isn't prime.");
			return;
		}
		
		if(number < 1) {
			System.out.println(" Invalid number");
		}
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0 ) {
				isPrime = false;	
			}
		}
		
		if(isPrime) {
			System.out.println("The number is prime.");
		}
		else {
			System.out.println("The number isn't prime.");
		}
	}

}
