/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc= new Scanner( System.in);
		System.out.print("Please enter an integer: ");
		int no1= sc.nextInt();
		
		System.out.println("Please enter another integer: ");
		int no2= sc.nextInt();
		
		boolean bob= (no1%2==0);
		if(bob){
			System.out.println(no1+ " is divisible by 2!");
		}
		boolean jim= (no1%4==0);
		if(jim){
			System.out.println(no1+ " is divisible be 4!");
		}

		if(!bob){
			System.out.println(no1+ " is not divisible by 2!");
		}

		
		if(!jim){
			System.out.println(no1+ " is not divisible be 4!");
		}

		System.out.println();


		boolean tom= (no2%2==0);
		if (tom){
			System.out.println(no2+ " is divisible by 2!");
		
		}
		boolean fred= (no2%3==0);
		if (fred){
			System.out.println(no2+ " is divisible by 3!");
		}
		if (!tom){
			System.out.println(no2+ " is not divisible by 2!");
		
		}
		
		if (!fred){
			System.out.println(no2+ " is not divisible by 3!");

	}
	}
}
