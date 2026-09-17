/*
 *	Author:  Jaden Zheng
 *  Date: 9/14/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int x= (int) (Math.random()*10); 
		System.out.println("A number between 0 - 9: " + x); 
		int hundo= (int) (Math.random()*101);
		System.out.println("A number betwenn 1- 100: " + hundo);
		double y= (Math.random()*1) +2.5;
		System.out.println("A double  between 2.5 and 3.5: "+ y);
		double c= (Math.random()*589) + 14;
		System.out.println("A double between 14 and 589: " + c);



	}
}
