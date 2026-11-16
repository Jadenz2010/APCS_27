/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int x=(int)(Math.random()*200+51);
		int [] arr=new int[x];

		for(int a=0;a<arr.length;a++){
			int y=(int)(Math.random()*100+1);
			arr[a]=y;
		}
		int min=arr[0];
		for(int a=0;a<arr.length;a++){
			if(arr[a]<min){
				min=arr[a];
			}
		}
	int max=0;
		for(int a=0;a<arr.length;a++){
			if(arr[a]>max){
				max=arr[a];
			}
		}
		int av=0;
		int count=0;
	for(int p=0;p<arr.length;p++){
		av=(av+arr[p])/(count+1);
		
	}
	System.out.println("The minimum is "+min);
	System.out.println("The maximum is "+max);
	System.out.println("The average is "+av);

		
	}
}
