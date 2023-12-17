package week1;
import java.util.Scanner;
import java.util.ArrayList;

public class PalindromeAlgorithm_Simplfied1 {

	public static void main(String[] args) {
		// Word to be checked as palindrome?
		System.out.println("Please enter the word you'd like to check if a palindrome: ");
		Scanner scanner = new Scanner(System.in);
		String possPal = scanner.nextLine();
		int numChar = possPal.length();
		
		// Create an arraylist -> allows size change of array + other features
		ArrayList<String> arr1 = new ArrayList<String>();
		
	
		int indexEnd = numChar - 1;		
		
		for (int indexStart = 0; indexStart < numChar; indexStart++) {
			if (indexStart < indexEnd) {
				arr1.add(possPal.substring(indexStart, indexStart +1));
				
			}else {
				arr1.add(possPal.substring(indexStart));
			}
		}
		//System.out.println("Array 1: " + arr1);
		
		// Setting up for reverse array
		ArrayList<String> arr2 = new ArrayList<String>();
		
		
		for (int indexStart = indexEnd; indexStart >= 0; indexStart--) {
			if (indexStart < indexEnd) {
				arr2.add(possPal.substring(indexStart, indexStart +1));
			} else {
				arr2.add(possPal.substring(indexStart));
				
			}
		}
		
		//System.out.println("Array 2: " + arr2);
		
		if (arr1.equals(arr2) == true) {
			System.out.println("Your word, " + possPal + ", is a palindrome.");
		} else {
			System.out.println("Your word, " + possPal + ", is not a palindrome.");
			
		}
			
		scanner.close();
		
		
		
		
}
}