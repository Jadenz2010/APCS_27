/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		System.out.println("Dog Name?");
		String n=sc.nextLine();
		Dog meat = new Dog(n);
		System.out.println("What age should "+n+" be?");
		int a=sc.nextInt();
		meat.setAge(a);
		System.out.println(meat.getName()+" is a "+meat.getBreed()+" that is "+meat.getAge()+" years old!");
		Dog meatJr=new Dog("Jim","lab",9);
		System.out.println(meatJr.getName()+" is a "+meatJr.getBreed()+" that is "+meatJr.getAge()+" years old!");
		

		if(meat.isSleeping()){
			System.out.println(meat.getName()+" is asleep! Don't wake "+meat.	getName()+" up.");
			
		}
		else{
			meat.bark();
				System.out.println(meatJr.getName()+" hears "+meat.getName()+"1");
				meatJr.bark();
			}
		
	
 		if(meatJr.isSleeping()){
            System.out.println(meatJr.getName()+" is asleep");
        }
        else {
            meatJr.bark();
        }

	

	}
}
