/*
 *	Author:  Jaden
 *  Date: 10/8/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to the guessing game!");
		System.out.println("Please guess a number: ");
		int op= (int)(Math.random()*1000+1);
		int guess=sc.nextInt();
		while(guess!=op){
			if(guess<op){
			System.out.println("The number is higher.\nPlease guess a number: ");
			guess=sc.nextInt();
			
		}
			if(guess>op){
			System.out.println("The number is lower.\nPlease guess a number: ");
			guess=sc.nextInt();
			
		}
		if(guess==op){
				break;
			}
		}

		if(guess==op){
			System.out.println("You got the number! ");
		}



		
	}
}
