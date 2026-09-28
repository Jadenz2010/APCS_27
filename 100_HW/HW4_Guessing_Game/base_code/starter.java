/*
 *	Author:Jaden Zheng
 *  Date:9/25/26
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc= new Scanner(System.in);
		System.out.println("The goal of this game is to guess a word with two hints!");
		int goh= (int)(Math.random()*3+1);
		boolean oj= goh==1;
		String fruit="Apple";
		String fruit2="apple";
		if(oj){
			System.out.println("It's a fruit!");
			System.out.println("What's your guess?");
			fruit= sc.nextLine();
			String apple="apple";
			String Apple="Apple";
			boolean no= fruit.equals(apple)|| fruit.equals(Apple);
			if(no){
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println("You sadly didn't get it right, here's another hint!");
				System.out.println("It's a red fruit.");
				fruit2= sc.nextLine();
			
			boolean not= (fruit2.equals(apple))|| (fruit2.equals(Apple));

			if(not){
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println("You sadly didn't get it right, it was an apple.");
				
		}
			}
		

	}
	boolean bob= goh==2;
	String planet="Jupiter";
	String planet2="Jupiter";
		if(bob){
			System.out.println("It's a planet in our solar system!");
			System.out.println("What's your guess?");
			planet= sc.nextLine();
			String Jupiter= "Jupiter";
			String jupiter="jupiter";
			boolean lol= (planet.equals(Jupiter))|| (planet.equals(jupiter));
			if(lol){
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println("You sadly didn't get it right, here's another hint!");
				System.out.println("It's the biggest planet in our solar system.");
				planet2= sc.nextLine();
			
		boolean lot= planet2.equals(Jupiter)|| planet2.equals(jupiter);
			if(lot){
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println("You sadly didn't get it right, it was Jupiter.");
			}	
		}
		}
	boolean jim= goh==3;
	String animal="Squirrel";
	String animal2= "squirrel";
		if(jim){
			System.out.println("It's a animal!");
			System.out.println("What's your guess?");
			animal= sc.nextLine();
			String Squirrel=  "squirrel";
			String squirrel= "Squirrel";
			boolean po= animal.equals(Squirrel)||animal.equals(squirrel);
			if(po){
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println("You sadly didn't get it right, here's another hint!");
				System.out.println("It's a brown neighborhood animal.");
				animal2= sc.nextLine();
			
		boolean pot= (animal2.equals(Squirrel))||(animal.equals(squirrel));
			if(pot){
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println("You sadly didn't get it right, it was a squirrel.");
				
		}
		}
	}
}
}

		