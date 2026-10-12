/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		System.out.println("Slot Machine Rules: \n1. Each player starts with $100.\n2. Input a wager less than your total amount of money.\n3. The slot machine will roll 3 numbers from 1 to 10.\na. If two numbers match, you double your money.\nb. If three numbers match, you triple your money.\nc. If none match, you lose your money"); 
		int money= 100;
		String yeppy= ("yes");
		while(money>0){
			System.out.println(" -------------------------------------------");
			System.out.println("Would you like to play slots? (Yes/yes/Y/y): ");
			yeppy= sc.nextLine();
			if(yeppy.equalsIgnoreCase("Yes")||yeppy.equalsIgnoreCase("Y")){
			System.out.println("You have $"+ money+". How much would you like to wager?");
			int bet=sc.nextInt();
			sc.nextLine();

			int roll1= (int)(Math.random()*9+1);
			int roll2= (int)(Math.random()*9+1);
			int roll3= (int)(Math.random()*9+1);
			if(bet<=money){
				System.out.println(" Great! Let's play!\n Your rolls are: \n----------------");
				System.out.println(roll1+"|"+roll2+"|"+roll3);
				System.out.println("-----------------");
			if(roll1==roll2||roll1==roll3||roll2==roll3){
					money=money+bet*2;
					System.out.println(" You won! You're wager has now been doubled!\nYou now have $"+money);
			}
			else if(roll1==roll2&&roll2==roll3){
				money=money+bet*3;
				System.out.println("You won the jackpot!!! You wager is now tripled!\nYou now have $"+ money);
			}
			else if(roll1!=roll2||roll1!=roll3||roll2!=roll3){
				money=money-bet;
				System.out.println("Didn't win this time, better luck next time!\nYou now have $"+ money);
			}
			}

		}
	
	
		else if(yeppy.equalsIgnoreCase("no")||yeppy.equalsIgnoreCase("n")){
			System.out.println("Sad to see you go! You still have $"+money +" left. See you soon!");
			break;
		}
		else if(!yeppy.equalsIgnoreCase("yes")&&!yeppy.equalsIgnoreCase("y")&&!yeppy.equalsIgnoreCase("no")&&!yeppy.equalsIgnoreCase("n")){
			System.out.println("That wasn't quite the correct answer. Try again. ");
		}
		if(money==0){
			break;
		}
	}
		if(money==0){
			System.out.println("You've run out of money! Come back soon!");
			
		}
	
	
	}
}
