/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	double balance;
	int accountNum;
	String status="active";
	String accountOwner;
	
	

	// -------CONSTRUCTORS-------
	public BankAccount(){
		balance=0.0;
		accountNum=(int)(Math.random()*1000+1);

		accountOwner="unknown";
	}
	public BankAccount(String o){
		balance=0.0;
		accountNum=(int)(Math.random()*1000+1);

		accountOwner=o;
	}
	public BankAccount(String o,double id){
		balance=id;
		accountNum=(int)(Math.random()*1000+1);

		accountOwner=o;
	}



	public BankAccount(double money, int num, String bank, String owner){
		balance=money;
		accountNum=num;

		accountOwner=owner;
	}

	// -------METHODS-------
	public void checkBalance(){
		System.out.println(balance);
	}
	
	public void displayAccountInfo(){
		System.out.println("---------------------------------------");
		System.out.println("Welcome "+accountOwner);
		System.out.println("You have $"+balance+" in your account.");
		System.out.println("Bank account number: "+ accountNum);
		System.out.println("Status: "+status);
	}
}