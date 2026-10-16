/*
 *	Author:  Jaden Zheng
 *  Date: 10/12/26
*/

import java.util.Scanner;

class starter {
	public static void toString(String sent1){
			
			System.out.println(sent1);
		} 
		public static void toStringCombined(String sent1, String sent2){
			
			System.out.println(sent1+" "+sent2);
		}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Write a sentence!");
		String sent1 =sc.nextLine();
		System.out.println("Write a sentence!");
		String sent2= sc.nextLine();
		System.out.println("This is using the methods");
		toString(sent1);
		toStringCombined(sent1,sent2);
		
	}
}
