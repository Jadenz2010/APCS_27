/*
 *	Author:Jaden Zheng
 *  Date:9/23/26
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc= new Scanner( System.in);
		System.out.print("Please enter an integer: ");
		int no1= sc.nextInt();
		
		System.out.println("Please enter another integer: ");
		int no2= sc.nextInt();
		
		boolean bob= (no1%2==0);
		boolean job= (no1%4==0);
		boolean nom=(no1%3==0);
		boolean jolly= (no1%5==0);
		if(bob){
			System.out.println(no1+ " is divisible by 2!");
		}
		else{
			System.out.println(no1+ " is not divisible by 2");
		}
			if(job){
				System.out.println(no1+ " is divisible by 4");
			}
			
			if(nom){
				System.out.println(no1+" is divisible by 3");
			}
			
			if(jolly){
				System.out.println(no1+ " is divisible by 5");
			}
			boolean dog= (!job&&!nom&&!jolly);
			if(dog){
			System.out.println(no1+ " is not divisible by 3,4, or 5!");
		}
	
		
		
		boolean billy= (no2%2==0);
		boolean josh= (no2%4==0);
		boolean wow=(no2%3==0);
		boolean polly= (no2%5==0);
		if(billy){
			System.out.println(no2+ " is divisible by 2!");
		}
		else{
			System.out.println(no2+" is not divisible by 2!");
		}
			if(josh){
				System.out.println(no2+ " is divisible by 4");
			}
			if(wow){
				System.out.println(no2+" is divisible by 3");
			}
			if(polly){
				System.out.println(no2+" is divisible by 5");
			}
		
	boolean kob= (!josh&&!wow&&!polly);
	if(kob){
			System.out.println(no2+ " is not divisible by 3,4, or 5!");
		}
		
	
	}
}