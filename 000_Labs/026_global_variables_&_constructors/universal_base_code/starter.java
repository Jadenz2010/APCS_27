/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount x = new BankAccount(123.27, 24380986, "Chase", "Bob");
		x.finalbank();
		BankAccount poo= new BankAccount(398.70,23345675, "Wells Fargo", "Jim");
		poo.finalbank();
		BankAccount apple=new BankAccount(128000.00, 67676767,"Bank of America","Ashley");
		apple.finalbank();
		BankAccount tree=new BankAccount(13.68, 976445656,"Bank of Hope","Faith");
		tree.finalbank();

		
	}
}
