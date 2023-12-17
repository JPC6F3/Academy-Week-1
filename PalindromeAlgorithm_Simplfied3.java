package week1;
import java.util.Scanner;
import java.util.ArrayList;

public class PalindromeAlgorithm_Simplfied3 {

	public static void main(String[] args) {
		// Word to be checked as palindrome?
		System.out.println("Please enter the word you'd like to check if a palindrome: ");
		Scanner scanner = new Scanner(System.in);
		String possPal = scanner.nextLine();
		int numChar = possPal.length();
		
		int indexStart = numChar -1;
		String reverseString = "";
		
		for (indexStart = numChar -1 ; indexStart >= 0; indexStart--) {
			reverseString = reverseString + possPal.charAt(indexStart);
		}
		
		if (possPal.equalsIgnoreCase(reverseString)) {
			System.out.println(possPal + " is a palindrome.");
		}	else {
				System.out.println(possPal + " is not a palindrome.");	
				//System.out.println(reverseString);
			}
		scanner.close();
}
}

