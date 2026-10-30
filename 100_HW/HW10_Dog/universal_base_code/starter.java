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
		Dog meat = new Dog("Bingo");
		meat.setAge(12);
		Dog meatJr=new Dog("Jim","lab");
		
		if(isSleeping()){
			System.out.println("Dog is asleep");
		}
		else{
			meat.bark();
			int x=1;
		}
	
		if(isSleeping){
			if(x==1){
				meatJr.bark();
			}
		}
		else{
			meatJrbark();
		}




	}
}
