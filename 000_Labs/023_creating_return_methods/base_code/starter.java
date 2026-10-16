/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static int pow(int un, int dos){
		int total=1;
			while(dos>0){
				total*=un;
			
				dos--;
				
			}
			return total;
		}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your base number?");
		int un=sc.nextInt();
		System.out.println("What is your exponent number?");
		int dos=sc.nextInt();
		System.out.print("Your answer is: ");
			System.out.println(pow(un,dos));
	}
}
