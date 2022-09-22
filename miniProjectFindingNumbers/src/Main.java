
public class Main {
	public static void main(String[] args) {
		int[] numbers = new int[] {	1, 2, 5, 6, 8, 0};
		int searc = 7;
		boolean isThere = false;
		
		for(int number : numbers) {
			if(number == searc) {
				isThere = true;
				break;
			}
		}
		if(isThere) {
			System.out.println("The number you're looking for is available.");
		}else {
			System.out.println("The number you're looking for isn't available.");
		}
	}
}
