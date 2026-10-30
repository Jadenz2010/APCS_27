/*
 *	Author:  Jaden Zheng
 *  Date: 10/31/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		int num=7;
		while(num>0){
		PooleDwarf uno = new PooleDwarf();
		uno.setName(randName());
		uno.setAge((int)(Math.random()*100));
		System.out.println(uno);
		num--;
		}
		
		
		

		
	}
}
