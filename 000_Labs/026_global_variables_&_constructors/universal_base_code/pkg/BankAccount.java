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
	public BankAccount(String bank, String owner){
		balance=0.0;
		accountNum=000000000000;
		bankName=bank;
		accountOwner=owner;
	}
	public BankAccount(double money, int num, String bank, String owner){
		balance=money;
		accountNum=num;
		bankName=bank;
		accountOwner=owner;
	}

	// -------METHODS-------

}