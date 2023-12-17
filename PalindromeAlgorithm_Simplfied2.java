package week1;
import java.util.Scanner;
import java.util.ArrayList;

public class PalindromeAlgorithm_Simplfied2 {

	public static void main(String[] args) {
		// Word to be checked as palindrome?
		System.out.println("Please enter the word you'd like to check if a palindrome: ");
		Scanner scanner = new Scanner(System.in);
		String possPal = scanner.nextLine();
		int numChar = possPal.length();
		
		// Create an reversed arraylist -> allows size change of array + other features
		ArrayList<String> arr1 = new ArrayList<String>();
		
	
		int indexEnd = numChar - 1;		
		
		for (int indexStart = indexEnd; indexStart >= 0; indexStart--) {
			if (indexStart < indexEnd) {
				arr1.add(possPal.substring(indexStart, indexStart +1));
			} else {
				arr1.add(possPal.substring(indexStart));
				
			}
		}
		// Converts reversed arraylist into a stringbuilder
		StringBuilder possPalReversed = new StringBuilder();
		for (String lettersOfArr1 : arr1) {
			possPalReversed.append(lettersOfArr1);
		}
		// Converts stringbuilder into string and checks if palindrome
		if (possPal.equalsIgnoreCase(possPalReversed.toString())) {
			System.out.println(possPal + " is a palindrome.");
		} else {
			System.out.println(possPal + " is not a palindrome.");
		}
			
		scanner.close();
		
		
		
		
}
}