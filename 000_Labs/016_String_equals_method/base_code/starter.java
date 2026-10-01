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
		Scanner sc=new Scanner(System.in);
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
	}
}
