package week1;
import java.util.Random;

public class RandomNumberGeneration {

	public static void main(String[] args) {
		Random rand = new Random();
		int randomNum = rand.nextInt(101);
		System.out.println(randomNum);

	}

}
