/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	public String name;
	public int age;

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
	}

	public PooleDwarf(String n, int a){
		name=new String(n);
		age=a;
	}

	/*	Accessor Methods */
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	/*	Mutator Methods	*/
	public void setName(String name){
		name=this.name;
	}
	
	public void setAge(int age){
		age=this.age;
	}

	public boolean isSameName(String name){
		name=this.name;
		return false;
	}
	
	 
}

