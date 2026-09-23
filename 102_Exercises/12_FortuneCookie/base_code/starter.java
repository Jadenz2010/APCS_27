/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Fortune Cookie Generator");
		System.out.println();
		System.out.println("Enter your favortie whole number: ");
		int psswrd= sc.nextInt();
		boolean bob= (psswrd%2==0)&&(psswrd<50);
		if (bob){
			System.out.println("You will step in dog poop today.");
		}
		boolean yo= (psswrd%3==0)&&(psswrd<50)&&psswrd%2!=0;
		if(yo){
			System.out.println("You will drop your phone in the toilet.");
		}
		boolean mama= (psswrd<0)&&(psswrd%3!=0);
		if(mama){
				System.out.println("You must keep going even if you meet challenges");
		}
		boolean jim= (psswrd%2!=0)&&(psswrd<0);
		if (jim){
			System.out.println("You will fumble the ball.");
		}
		boolean doog= (psswrd==50);
		if (doog){
			System.out.println("Ms. Smith will get fired");
		}
		boolean kimjongun=psswrd<100&&(psswrd>50)&&(psswrd%5==0);
		if(kimjongun){
			System.out.println("You become allergic to the one thing you need in life.");
		}
		boolean trump= psswrd<100&&(psswrd>50)&&(psswrd%5!=0);
		if(trump){
			System.out.println("You will go home and stub your toe then hop on one foot and accidentaly bump into the stove and set your hair on fire!!!");
		}
		boolean putin= psswrd>100&&psswrd%2==0;
		if(putin){
			System.out.println("Somewhere far away aliens will discover a new planet and name it after you.");
		}
		boolean biden= psswrd>100&&psswrd%2!=0;
		if(biden){
			System.out.println("The one who says they didn't fart is lying.");
		}
		boolean nom= psswrd==100;
		if(nom){
			System.out.println("You will run over a dog but the dog is secretly an immortal superdog and they get angry and detroy you with laser eyes then destroy the whole universe to avenge his dead wife.");
		}

	}
}
