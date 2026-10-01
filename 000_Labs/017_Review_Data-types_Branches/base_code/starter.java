/*
 *	Author:  Jaden Zheng
 *  Date: 9/30/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
Scanner sc=new Scanner(System.in);
	System.out.println("Whats your name?");
	String name= sc.nextLine();
	System.out.println("What is your title? Ex. Eater of souls");
	String title= sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?"); 
		String player= sc.nextLine();
	
		if(player.equals("Wizard")||player.equals("wizard")){
			System.out.println("You've chosen the Wizard! Excelsior!");
		}
		if(player.equals("Warrior")|| player.equals("warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		if(player.equals("Rogue")||player.equals("rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		if(!player.equals("Wizard")&&!player.equals("wizard")&&!player.equals("Warrior")&&!player.equals("warrior")&&!player.equals("Rogue")&&!player.equals("rogue")){
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
	System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, Constitution, Charisma. Spend them wisely.");
	System.out.println("Strength (1-10): ");
	int strength= sc.nextInt();
	int left= 20-strength;
	if(left>=0){
		System.out.println("You have "+ left+" left to spend.");
	}
	else{
		System.out.println("Please enter a smaller number");
		strength=sc.nextInt();
	}
	System.out.println("Dexterity (1-10): ");
	int dex= sc.nextInt();
	int left2= left-dex;
	if(left2>=0){
		System.out.println("You have "+ left2+ " left to spend.");
	}
	else{
		System.out.println("Please enter a smaller number.");
		dex= sc.nextInt();
	}
	System.out.println("Intelligence(1-10): ");
	int tell= sc.nextInt();
	int left3=left2-tell;
	if(left3>=0){
		System.out.println("You have "+ left3+" left to spend.");
	}
	else{
		System.out.println("Please enter a smaller number.");
		tell=sc.nextInt();
	}
	System.out.println("Charisma (1-10): ");
	int cha= sc.nextInt();
	int left4= left3-cha;
	if(left4<0){
		System.out.print("Please enter a smaller value.");
		cha=sc.nextInt();
	}
	System.out.println("-----------------------------------------------");
	System.out.println("Welcome "+ name+", the "+ title+" of CVHS.");
	System.out.println("You're a warrior with the following stats:");
	System.out.println("Strength: "+ strength);
	System.out.println("Dexterity: "+ dex);
	System.out.println("Intelligence: "+ tell);
	System.out.println("Charisma: "+ cha);
	System.out.println("Good luck on your quest "+ name+" the "+ title);
	}
}
	
