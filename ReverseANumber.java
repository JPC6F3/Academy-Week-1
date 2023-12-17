package week1;
import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		System.out.println("Please enter a number to be reversed:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int numAdjusted = num;
		int numReverse = 0;
		
		for (numReverse = 0; numAdjusted > 0; numReverse += 0) {
			numReverse = numReverse * 10 + numAdjusted % 10;
			numAdjusted = numAdjusted / 10;
		}
		System.out.println(numReverse);
		
		scanner.close();
}
}
