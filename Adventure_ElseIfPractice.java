package week1;
import java.util.Scanner;

public class Adventure_ElseIfPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\n You are on an island surrounded by water.\n There is a path to the woods to the north, the sea to the south, and a beach shack to the east. \n Which way do you want to go (n,e,s,w)?");
	    String command = scan.nextLine();
	    if (command.equals("n")) 
	    {
	        System.out.println("You enter the forest and hear some rustling. \nThere may be tigers here or maybe it's just monkeys.");
	    }
	    else if (command.equals("s"))
	    {
	    	System.out.println("You walk on the sand of the beach and notice footprints. \nThese footprints look larger than a human's...");
	    }
	    else if (command.equals("e"))
	    {
	    	System.out.println("You walk towards the beach shack and notice it's stocked with industrial crates. \nWho set this up?");
	    }
	    else if (command.equals("w"))
	    {
	    	System.out.println("You've begun walking westwards toward the sun. \nThe further you walk, the more things seem to be the same distance away...\nAre you sure you're really seeing what you see?");
	    }
	    else
	    {
	    	System.out.println("You've entered an invalid input. Please enter s,n,e,w to pick a direction to explore.");
	    }
	    // Add else-ifs for s, e, w, and an else for any other input. Be creative!
	    
	    
	    System.out.println("End of adventure!");   
	    scan.close();
	}

}
