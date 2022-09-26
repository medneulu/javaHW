
public class Main {

	public static void main(String[] args) {
		
		findingNumbers();
	}
	
	public static void findingNumbers () {
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
			showMessage("The number you're looking for is available: " + searc);
		}else {
			showMessage("The number you're looking for isn't available: " + searc);
		}
	}
	
	public static void showMessage( String message) {
		System.out.println(message);
	}

}
