/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=  new Scanner(System.in);
		System.out.println("Please input your first number: ");
		int v1= sc.nextInt();
		System.out.println("Please print your second number: ");
		int v2= sc.nextInt();
		System.out.println("The first variable is: "+ v1); 
		System.out.println("The second variable is: "+ v2); 
		boolean answer= v1==v2;
		if (answer){
			System.out.println("The variables are the same"); 

		}
		if (!answer){
			System.out.println("The variables are different");
	}
}
}
