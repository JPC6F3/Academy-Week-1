package week1;

public class PrintingArrays {

	public static void main(String[] args) {
		int [] arr1 = {10, 20, 30, 40, 50, 60, 70};
		System.out.println(arr1[1] + " " + arr1[3]);
		
		for (int indexStart = 1; indexStart < arr1.length; indexStart+= 2) {
			System.out.print(arr1[indexStart] + " ");
		}
		
		System.out.println();
		
		// Program to recite all even numbers between 0 and 100; exclude 0, include 100
		for (int num = 0; num >= 0 & num < 101; num +=2) {
			if (num > 0) {
				System.out.print(num + " ");
			}
		}
	}
}





/*  Step 1 - initialize counter variable at 0
 *  Step 2 - Create for loop
 *  	uses counter variable
 *  	Constraint: => 0 && < 101
 *  	Iteration: increment counter variable by 2
 *  	Embedded statement: if greater 0, print counter variable  
 * 
 * 
 * */
 