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
	String status;
	String accountOwner;
	
	

	// -------CONSTRUCTORS-------
	public BankAccount(){
		balance=0.0;
		accountNum=(int)(Math.random()*1000+1);
		accountOwner="unknown";
		status="Active";
	}
	public BankAccount(String o){
		balance=0.0;
		accountNum=(int)(Math.random()*1000+1);
		accountOwner=o;
		status="Active";
	}
	public BankAccount(String o,double id){
		balance=id;
		accountNum=(int)(Math.random()*1000+1);
		accountOwner=o;
		status="Active";
	}



	public BankAccount(double money, int num, String bank, String owner){
		balance=money;
		accountNum=num;
		accountOwner=owner;
		status="Active";
	}

	// -------METHODS-------
	public void checkBalance(){
		System.out.println(balance);
	}
	public String getOwner(){
		return accountOwner;
	}
	public String setOwner(String go){
		accountOwner=go;
		return accountOwner;
	}
	public double getBalance(){
		return balance;
	}
	public String closeAccount(){
		status="Inactive";
		return status;
	}
	public String isActive(){
		return status;
	}
	public double deposit(double deposit){
		if (status=="active"){
			balance+=deposit;
		}
			return balance;
	}
	public double withdraw(double deposit){
		if (status=="active"){
			if(balance>=deposit){
				balance-=deposit;
			
			}
		}
				return balance;
	}

	public void displayAccountInfo(){
		System.out.println("---------------------------------------");
		System.out.println("Welcome "+accountOwner);
		System.out.println("You have $"+balance+" in your account.");
		System.out.println("Bank account number: "+ accountNum);
		System.out.println("Status: "+status);
	}
}

	