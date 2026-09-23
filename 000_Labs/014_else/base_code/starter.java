/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner jaden= new Scanner(System.in);
		System.out.print("Pick a number between 1-1000: "); 
		int pink= jaden.nextInt();
		int loco= (int)(Math.random()*1000);
		boolean joe= pink==loco;
		if(joe){
			System.out.println("Your number was the random number! The number was "+ loco);
		}
		else{
			System.out.println("Your number wasn't the random number. The number was "+ loco);
		}
	}
}
