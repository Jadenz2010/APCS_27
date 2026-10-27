/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee DwightSchrute= new Employee(1987,"Dwight","Schrute",4416.66);
		DwightSchrute.employeeToString();
		Employee Jimmy=new Employee(2474,"Jim","Halpert",4416.66);
		Jimmy.employeeToString();
		Employee pam=new Employee(2011,"Pam","Beesly",2250);
		pam.employeeToString();
		Employee sevensixfivenine=new Employee(7659,"sevensix","fivenine",9567.0);
		sevensixfivenine.employeeToString();
		pam.raiseSalary(15);
		System.out.println(michael.getAnnualSalary());
		System.out.println(DwightSchrute.getAnnualSalary());
		System.out.println(Jimmy.getAnnualSalary());
		System.out.println(pam.getAnnualSalary());
		System.out.println(sevensixfivenine.getAnnualSalary());
		


		
	}
}
