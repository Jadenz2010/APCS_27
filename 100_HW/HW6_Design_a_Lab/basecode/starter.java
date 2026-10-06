/*
 *	Author
 *  Date:
 * 	Collaborator:
 */

import java.util.*;

public class starter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to: Find your spirit animal!!");
        System.out.println("Please enter your name: ");
        String name= sc.nextLine();
        System.out.println("Please enter your blood type( A+- ,B+- ,AB+- ,O+- , idk): ");
        String blood= sc.nextLine();
            if(blood.equalsIgnoreCase("O+")){
            System.out.println("Your spirit animal is the bunny! Lovable by everyone.");
        }
            if(blood.equalsIgnoreCase("O-")){
             System.out.println("Your spirit animal is the Me. AKA da goat.");
        }
            if(blood.equalsIgnoreCase("A+")){
            System.out.println("Your spirit animal is the Tiger! Eye of the Tiger was my favorite song when I was six.");
        }
            if(blood.equalsIgnoreCase("A-")){
            System.out.println("Your spirit animal is the Refridgerator. Cuz you always go back to it.");
        }
            if(blood.equalsIgnoreCase("B+")){
            System.out.println("Your spirit animal is the Panda. You love eating and sleeping");
        }
            if(blood.equalsIgnoreCase("B-")){
            System.out.println("Your spirit animal is Taco Bell. Diarrhea.");
        }
            if(blood.equalsIgnoreCase("AB+")){
            System.out.println("Your spirit animal is the Wolf. Im the Alpha.");
        }
            if(blood.equalsIgnoreCase("AB-")){
            System.out.println("Your spirit animal is The Gub. Fly high.");
            
        }
            if(blood.equalsIgnoreCase("IDK")){
            System.out.println("Your spirit animal is a monkey. You can guess why.");
        }
        if(!blood.equalsIgnoreCase("a")&&!blood.equalsIgnoreCase("a+")&&!blood.equalsIgnoreCase("a-")&&!blood.equalsIgnoreCase("b+")&&!blood.equalsIgnoreCase("b-")&&!blood.equalsIgnoreCase("ab+")&&!blood.equalsIgnoreCase("ab-")&&!blood.equalsIgnoreCase("idk")&&!blood.equalsIgnoreCase("o+")&&!blood.equalsIgnoreCase("o-")){
            System.out.println("Animals are scared of you:( Try again.");
        }
     }
        
}
        
    
