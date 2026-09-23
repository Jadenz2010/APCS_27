/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc= new Scanner(System.in);
		System.out.print("Please enter your first number: "); 
		int Bob= sc.nextInt();
		System.out.print("Please enter your second number: ");
		int jim= sc.nextInt();
		System.out.print("Please enter your third number: ");
		int yo= sc.nextInt();
		boolean poop= Bob>jim && Bob>yo;
		if(poop){
			System.out.println("Your first number is the largest of the three!");
			System.out.println("The number was "+ Bob);
		}
		boolean peep= jim>Bob && jim>yo;
		if(peep){
			System.out.println("Your second number is the largest of the three!");
			System.out.println("The number was "+ jim);
		}
		boolean doog= yo>Bob&&yo>jim;
		if(doog){
			System.out.println("Your thrid number is the largest of the three!");
			System.out.println("The number was "+ yo);
		}

		boolean poo= Bob<jim && Bob<yo;
		if(poo){
			System.out.println("Your first number is the smallest of the three!");
			System.out.println("The number was "+ Bob);
		}
		boolean pee= jim<Bob && jim<yo;
		if(pee){
			System.out.println("Your second number is the smallest of the three!");
			System.out.println("The number was "+ jim);
		}
		boolean doo= yo<Bob&&yo<jim;
		if(doo){
			System.out.println("Your thrid number is the smallest of the three!");
			System.out.println("The number was "+ yo);
		}
	}
}
