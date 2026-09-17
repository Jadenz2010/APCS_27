/*
 *	Author:Jaden Zheng  
 *  Date: 9/14/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		// Your code goes below here
		System.out.println("======================================");
		System.out.println("WELCOME RESTAURANT OWNER");
		System.out.println("======================================");
		System.out.println();

		System.out.println("What's the name of your restaurant?");
		String restaurant =sc.nextLine();
	
	

		System.out.println("What's your name?");
		String name =sc.nextLine();
		System.out.println();


		System.out.println("It's great to see you, " + name+ ". Let's set up a menu for "+ restaurant);
		System.out.println("Tonight's menu has room for exactly 3 items. Let's go!");
		System.out.println();

		System.out.println("--- Item #1---");
		System.out.print("Item name: ");
		String one= sc.nextLine();

		System.out.print("Price of "+ one + "($):");
		double price1=sc.nextDouble();
	
		System.out.print("How many "+ one+ " would you like?: ");
		int amount1= sc.nextInt();
		sc.nextLine();

		double total1= price1*amount1;
		System.out.println("Added " + amount1 + "x "+ one + " to your order! ("+ total1+ ")");

		System.out.println("--- Item #2 --- ");
		System.out.print("Item name: ");
		String two= sc.nextLine();


		System.out.print("Price of "+ two + "($):");
		double price2=sc.nextDouble();
		sc.nextLine();
		
		System.out.print("How many "+ two+ " would you like?: ");
		int amount2= sc.nextInt();

		double total2= price2*amount2;
		System.out.println("Added " + amount2 + "x "+ two + " to your order! ("+ total2+ ")");

		System.out.println("--- Item #3 ---");
		System.out.print("Item name: ");
		String three= sc.next();
		

		System.out.print("Price of "+ three + "($):");
		double price3 =sc.nextDouble();


		System.out.print("How many "+ three+ "would you like?: ");
		int amount3= sc.nextInt();

		double total3= price3*amount3;
		System.out.println("Added " + amount3 + "x "+ three + " to your order! ("+ total3+ ")");
		System.out.println("Nice choices! What tip percentage would you like to leave (ex. 15, 18, 20):");
		double tip= sc.nextDouble();


		System.out.println("=================================================");
		System.out.println("	" +restaurant + " - Menu For Today");
		System.out.println("=================================================");
		System.out.println ("Owner: "+name);
		System.out.println("-------------------------------------------------");
		System.out.println("Item              Qty     Price");
		System.out.println("-------------------------------------------------");
		System.out.println(one +"             "+ amount1 + "	"+ price1);
		System.out.println(two + "              " + amount2+ "	"+ price2);
		System.out.println(three + "             "+ amount3+"	"+ price3);
		System.out.println("-------------------------------------------------");
		double Subtotal= total1+total2+total3;
		System.out.println("Subtotal:       	   	   "+ Subtotal);
		double tax= Subtotal*0.0975;
		System.out.println("Tax (9.75%):                   " + tax+ "%");
		System.out.println("Tip: 				"+ tip);
		double tipamount= Subtotal*0.0015;
		System.out.println("Tip Amount: 			"+ tipamount);
		System.out.println("=================================================");
		double complete= Subtotal+tax+tip+tipamount;
		System.out.println("TOTAL: 				"+ complete);
		System.out.println("=================================================");

		System.out.println("Thanks for eating at " + restaurant + "!");
		System.out.println("Come back soon --- we'll always have a byte for you!");


		







		
	}
}
