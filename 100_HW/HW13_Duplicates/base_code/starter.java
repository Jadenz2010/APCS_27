/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr=new int[20];		
		System.out.println("These are the 20 numbers");
		for(int a=0;a<arr.length;a++){
			arr[a]=(int)(Math.random()*9+1);
			System.out.print(a+" ");
		}
		System.out.println("");
		int dup=(int)(Math.random()*9+1);
		System.out.println("The random number to look out for is "+dup);
		int p=0;
		for(int x=0;x<arr.length;x++){
			if(arr[x]==dup){
				System.out.println("Duplicate found at index "+x);
				p++;
			}
		}
		System.out.println("Total number of duplicates for "+dup+" is "+p);

		System.out.println("------------------------------------------------");
		System.out.println("Looking for 2 in a row");
		for(int y=0;y+1<arr.length;y++){
			if(arr[y]==arr[y+1]){
				System.out.println("Two in a row found at index " +y+" and "+(y+1)+". The number is "+arr[y]);
			}
		}

	}
}
