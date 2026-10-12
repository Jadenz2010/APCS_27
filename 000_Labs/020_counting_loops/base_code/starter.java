/*
 *	Author:Jaden
 *  Date: 10/8/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name=sc.nextLine();
		System.out.println("Please enter how many times you'd like to print your name: ");
		int num= sc.nextInt();
		
		while(num>=0){
			if(num<0){
				break;
			}
			System.out.println(name);
			num=num-1;
		}



		
	}
}
