package week1;
import java.util.Scanner;

public class PalindromeAlgorithm {

	public static void main(String[] args) {
		// Word to be checked as palindrome?
		System.out.println("Please enter the word you'd like to check to be a palindrome: ");
		Scanner scanner = new Scanner(System.in);
		String possPal = scanner.nextLine();
		int numChar = possPal.length();
		
		// Check if character count is even or odd
		boolean evenCheck = (numChar % 2) == 0;
		// System.out.println(evenCheck);
		
		
		if (evenCheck == true) {
			// Initialization of counter variables for loop
			int lettersRemaining = numChar;
			int indexStart = 0;
			int indexEnd = lettersRemaining - 1;
			
			while (lettersRemaining > 0) {
				String char1 = possPal.substring(indexStart, indexStart + 1);
				String char2 = ""; // Declared as empty variable to assist with tech issue
				if (indexEnd == numChar -1) { // If ending with last letter, there should be no secondary index positioning. References numChar because it is static; lettersRemaining will change
					char2 = possPal.substring(indexEnd);
				}else {
					char2 = possPal.substring(indexEnd, indexEnd +1); // If not ending with last letter, there needs to be a secondary index positioning
					}
					
				if (char2.equalsIgnoreCase(char1)) {
					lettersRemaining = lettersRemaining -2;
						if (lettersRemaining == 0) {
							System.out.println("Your chosen word, " + possPal + ", is a palindrome.");
						}
					indexStart++;
					indexEnd--;
				}else {
					System.out.println("Your chosen word, " + possPal + ", is not a palindrome.");
					break;
					}
				
			} // end of while lettersRemaining > 0 loop
			
			
		} else {
			// Initialization of counter variables for loop
						int lettersRemaining = numChar;
						int indexStart = 0;
						int indexEnd = lettersRemaining - 1;
						
						while (lettersRemaining > 2) {
							String char1 = possPal.substring(indexStart, indexStart + 1);
							String char2 = ""; // Declared as empty variable to assist with tech isue
							if (indexEnd == numChar -1) { // If ending with last letter, there should be no secondary index positioning. References numChar because it is static; lettersRemaining will change
								char2 = possPal.substring(indexEnd);
							}else {
								char2 = possPal.substring(indexEnd, indexEnd +1); // If not ending with last letter, there needs to be a secondary index positioning
								}
								
							if (char2.equalsIgnoreCase(char1)) {
								lettersRemaining = lettersRemaining -2;
									if (lettersRemaining < 2) {
										System.out.println("Your chosen word, " + possPal + ", is a palindrome.");
									}
								indexStart++;
								indexEnd--;
							}else {
								System.out.println("Your chosen word, " + possPal + ", is not a palindrome.");
								break;
								}
							
						} // end of while lettersRemaining > 2 loop			
	
	
	
	
	
	
	
	
	
	
	
	
	}
		scanner.close();
}
}










// Pseudocode
// possiblePalindrome = user input
// boolean possiblePalindrome even?
	// if even:
		// lettersRemaining = length of possiblePalindrome
		// indexStart = 0
		// indexEnd = lettersRemaining -1
			// while lettersRemaining > 0:
				// boolean substring of possiblePalindrome(indexStart, indexStart +1) equals substring of possiblePalindrome (indexEnd,Index end))
					// if boolean true
						// lettersRemaining -2
						// indexStart++
						//indexEnd--
					// if boolean false
						//print non-palindrome
			// if boolean true -> palindrome; if boolean false -> non-palindrome

		
	// if odd
		//lettersRemaining = length of possiblePalindrome
				// indexStart = 0
				// indexEnd = lettersRemaining -1
					// while lettersRemaining > 1:
						// boolean substring of possiblePalindrome(indexStart, indexStart +1) equals substring of possiblePalindrome (indexEnd,Index end))
							// if boolean true
								// lettersRemaining -2
								// indexStart++
								//indexEnd--
							// if boolean false
								//print non-palindrome
					// if boolean true -> palindrome; if boolean false -> non-palindrome