/*
 *	Author:Jaden Zheng
 *  Date:9/17/26
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc= new Scanner (System.in);
		System.out.println("Please enter an integer: "); 
		int first= sc.nextInt();
		System.out.println("Please enter another integer (bigger than first): "); 
		int second= sc.nextInt();

		System.out.println("Your range is "+ first + " to "+ second);
		System.out.println("Here are 5 numbers generated in that range."); 
		System.out.println((int)(Math.random()*(second -first)+ first) +","+(int)(Math.random()*(second -first)+ first) +","+(int)(Math.random()*(second -first)+ first) +","+(int)(Math.random()*(second -first)+ first) +","+(int)(Math.random()*(second -first)+ first) +",");

	}
}
