/*
 *	Author:Jaden Zheng
 *  Date:11/4/26
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int n){
		
		if(n<=1){
			return false;
		}
		int left=2;
		while(left<n){
			if(n%left==0){
			return false;
		}
		left++;
		}
			return true;
	}
	public static void printPrimes(int x){
		int n=2;
		while (n!=x){
		if(checkPrime(n)){
			System.out.println(n);
		}
		n++;
		}
	}
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int num=sc.nextInt();
		printPrimes(num);
	}
}
