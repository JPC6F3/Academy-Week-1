package week1;

public class WorkingWithStrings {

	public static void main(String[] args) {
		String greeting = new String("Hello");
		System.out.println(greeting);
		
		String greeting2 = "Hello 2";
		System.out.println(greeting2);
	
		// Retrieving class of greeting object
		Class currClass = greeting.getClass();
		System.out.println(currClass);
		
		// Retrieves parent class for the child class
		Class parentClass = currClass.getSuperclass();
		System.out.println(parentClass);
		
		// Concatenation
		String saludades = "Happy Birthday";
		String lastName = "Jose";
		System.out.println(saludades +" " +lastName +" !!!");
	
		// Printing special characters using escape sequences
		String messageWithSpecialCharacters = "Here is a backslash quote \" " + "and a backslashed backslash (\\)." + " Backslash n \n prints out a new line.";
		System.out.println(messageWithSpecialCharacters);
		
		// Using different methods with Strings
		System.out.println(lastName.length());
		System.out.println(lastName.substring(1,4));
		System.out.println(lastName.indexOf("e"));
		
		// Comparison methods with Strings
		String message = "Hello!";
		System.out.println(message.compareTo("Hello there"));
	    System.out.println(message.compareTo("Hello!"));
	    System.out.println(message.compareTo("And"));
	    System.out.println(message.compareTo("Zoo"));

	    System.out.println(message.equals("Hello!"));
	    System.out.println(message.equals("hello!"));
		
	    
	    // Fixing bugs from StringMistakes.java (on Coding Rooms)
	    
	    String str1 = "Hello!";

	    // Print out the first letter? JL: Changed index start to 0 from 1
	    System.out.println("The first letter in " + str1 + ":" + str1.substring(0,1) );

	    // Print out the last character? JL: Changed index start from 8 to 5
	    System.out.println("The last char. in " + str1 + ":" + str1.substring(5) );

	    // Print str1 in lower case? Will str1 change? JL: Added method .toLowerCase() to str1
	    str1.toLowerCase();
	    System.out.println("In lowercase: " + str1.toLowerCase());
	}

}
