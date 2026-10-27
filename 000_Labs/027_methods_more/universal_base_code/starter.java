/*
 *	Author:  jaden zheng
 *  Date: 10/22/26
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Jaden ATM.\nWe're going to create a bank account. WHat info do we know?");
		System.out.println("1 - nothing\n2 - Owner\n3 - Owner and Initial deposit");
		int open=sc.nextInt();
		sc.nextLine();
		String o="unknown";
		double id=0.0;
		BankAccount x=new BankAccount();
		if(open==1){
	
		System.out.println("Account successfully created!");
		System.out.println("--- Account Info----");
		x.displayAccountInfo();		
		}
		if(open==2){
		
		System.out.println("What is the name of the owner of this bank account?");
		o=sc.nextLine();
		x = new BankAccount(o);
		System.out.println("--- Account Info----");
		x.displayAccountInfo();
		}
		if(open==3){
			
			System.out.println("What is the name of the owner of this bank account?");
			o=sc.nextLine();
			System.out.println("How much are you initially depositing into this account?");
			id=sc.nextDouble();
			sc.nextLine();
			x= new BankAccount(o, id);
			x.displayAccountInfo();

		}
		else if(open!=1&&open!=2&&open!=3){
			System.out.println("Account unsuccessfuly created.");
		}
		System.out.println("Would you like to check the balance of this account? (yes/no)");
		String yeh=sc.nextLine();
		if(yeh.equalsIgnoreCase("yes")){
			System.out.println("Current Account Balance: $"+ x.checkBalance());
		}
		else if(yeh.equalsIgnoreCase("no")){
			System.out.println("Great! No balance checked.");
		}
		else{
			System.out.println("Unable to comprehend.");
		}
		System.out.println("Thanks for coming to the Jaden ATM.");
		
	}
}
