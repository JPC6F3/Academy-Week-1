package week1;
import java.util.Scanner;

public class ReduceToZero {

	public static void main(String[] args) {
		System.out.println("Please enter an integer greater than -1: ");
		Scanner scanner = new Scanner(System.in);
		int originalNumber = scanner.nextInt();
		
		int numSteps = 0;
		
		for (int newNumber = originalNumber; newNumber != 0; numSteps++) {
			if (newNumber % 2 == 0) {
				newNumber = newNumber / 2;
			
			} else {
				newNumber--;
			}
		}
		
		System.out.println("Rules: If even, divide by 2; if odd, substract by 1.");
		System.out.println("It would take " + numSteps + " step(s) to reduce " + originalNumber + " to 0.");
		
		scanner.close();
	}

}
