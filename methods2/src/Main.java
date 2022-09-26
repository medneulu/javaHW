
public class Main {

	public static void main(String[] args) {	
		//String message ="The weather is nice today. ";
		//return message.substring(0,2);
		//String newMessage = message.substring(0, 2); // substring returns the newly determined value.
		String newMessage = newMessage();
		System.out.println(newMessage);
		
		int number = add(5, 7);
		System.out.println(number);
		
		int total = add2(2, 4, 5, 8, 9);
		System.out.println(total);
	}

	public static void add() {
		System.out.println("Added");
	}
	
	public static void delete() {
		System.out.println("Deleted");
	}
	
	public static void update() {
		System.out.println("Updated");
	}
	
	public static String newMessage() {
		String message ="The weather is nice today. ";
		return message.substring(0,2);
	}
	
	public static int add(int number1, int number2) {
		return number1 + number2;
	}
	
	public static int add2( int... numbers) {
		int total = 0;
		for(int number: numbers) {
			total += number;
		}
		return total;
	}
}
