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
	String bankName;
	String accountOwner;
	
	

	// -------CONSTRUCTORS-------
	public BankAccount(){
		balance=0.0;
		accountNum=000000000000;
		bankName="unknown";
		accountOwner="unknown";
	}

	public BankAccount(double money, int num, String bank, String owner){
		balance=money;
		accountNum=num;
		bankName=bank;
		accountOwner=owner;
	}

	// -------METHODS-------
	public void setbalance(double b){
		balance=b;
		return;
	}
	public void setaccont(int n){
		accountNum=n;
		return;
	}
	public void setbank(String bN){
		bankName=bN;
		return;
	}
	public void setowner(String o){
		accountOwner=o;
		return;
	}
	public void finalbank(){
		System.out.println("---------------------------------------");
		System.out.println("Welcome "+accountOwner);
		System.out.println("You have $"+balance+" in your account.");
		System.out.println("Bank account number: "+ accountNum);
		System.out.println("Bank: "+bankName);
	}
}