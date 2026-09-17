/*
 *	Author:  Jaden Zheng
 *  Date: 9/10/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Max: " + Math.max (13 - 6 * 11, 30 % 7 * (-2))) ;
		System.out.println("Sqrt: "+ Math.sqrt (3 * 8 + 31 % 7));
		System.out.println("Pow: " + Math.pow (37 / 3, 35 % 21));
		System.out.println("Max :" + Math.max( Math.pow( 2,14%3) , Math.sqrt ( 2*6) ));

		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a double: ");
		double x= sc.nextDouble();
		System.out.println("Please enter another double: ");
		double y=  sc.nextDouble();

		double maximum= Math.max(x,y);
		double root= Math.sqrt(y);
		double power= Math.pow(x,y);
		System.out.println("Maximum number of and y is: "+ maximum);
		System.out.println("Square root of y is: "+ root);
		System.out.println("Power of x and y is: "+ power);

		
	
		

	}
}
