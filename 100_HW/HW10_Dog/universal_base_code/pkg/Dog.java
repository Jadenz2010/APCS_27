package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	
		public int age;
		public String name;
		public String breed;
		
	
	public Dog(){
		name="Clifford";
		age=3;
		breed="big red dog";
	}
	public Dog(String n){
		name=n;
		age=1;
		breed="dog dog";
	}
	public Dog(String n, String b){
		name=n;
		age=1;
		breed=b;
	}
	public Dog(String n, int a){
		name=n;
		age=a;
		breed="dog dog";
	}
	public int setAge(int age){
		age=this.age;
		
	}
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		name=this.name;
	}
	public String getBreed(){
		return breed;
	}
	public void setBreed(String breed){
		breed=this.breed;
		
	}
	public boolean isSleeping(int asleep){
		asleep=(int)(Math.random()*2);
		if(asleep==1){
			return true;
		}
	}
	public void bark(){
		getName();
		System.out.println("bark, bark");
	}
	
	}
