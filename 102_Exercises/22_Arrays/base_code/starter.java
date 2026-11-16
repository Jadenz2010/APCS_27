/*
 *	Author:Jaden Zheng
 *  Date:11/9/26
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr=new int [1001];
		int x=0;
		int y=0;
		while(x<arr.length){
			y=y+3;
			arr[x]=y;
			System.out.print(arr[x]+", ");
			x++;
		}
		int[] arr2=new int[1001];
		int a=0;
		int b=1001;
		while(a<arr.length){
			b--;
			arr2[a]=b;
			System.out.print(arr2[a]+", ");
			a++;

		}
		

		 
	}
}
