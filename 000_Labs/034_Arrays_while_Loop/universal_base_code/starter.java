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
	int [] arr=new int[1000];
	int i=0;
	int x=0;
	while(x<1000){
		i=(int)(Math.random()*100);
		arr[x]=i;
		x++;
	}
	int y=0;
	while(y<1000){
		System.out.println(arr[y]);
		y++;
	}

		
	}
}
