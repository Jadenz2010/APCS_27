/*
 *	Author:  Jaden Zheng
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
	for(int x=0;x<1000;x++){
		i=(int)(Math.random()*100);
		arr[x]=i;
	}
	for(int y=0;y<1000;y++){
		System.out.println(arr[y]);
	}

		
	}
}

