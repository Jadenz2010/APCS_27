/*
 *	Author:  Jaden Zheng
 *  Date: 10/31/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
    // Your code goes below here
    int num=7;
    int twin=0;
    int most=0;
    String name="";
    String winner="";

    int dopey=0;
    int bashful=0;
    int grumpy=0;
    int sleepy=0;
    int sneezy=0;
    int happy=0;
    int doc=0;

    while(num>0){
        PooleDwarf uno = new PooleDwarf();
        name=randName();
        uno.setName(name);
        uno.setAge((int)(Math.random()*100+1));

        if(uno.isSameName("Dopey")){
            dopey++;
        }
        if(uno.isSameName("Bashful")){
            bashful++;
        }
        if(uno.isSameName("Grumpy")){
            grumpy++;
        }
        if(uno.isSameName("Sleepy")){
            sleepy++;
        }
        if(uno.isSameName("Sneezy")){
            sneezy++;
        }
        if(uno.isSameName("Happy")){
            happy++;
        }
        if(uno.isSameName("Doc")){
            doc++;
        }

        num--;
    }

    most=dopey;
    winner="Dopey";

    if(bashful>most){
        most=bashful;
        winner="Bashful";
    }
    if(grumpy>most){
        most=grumpy;
        winner="Grumpy";
    }
    if(sleepy>most){
        most=sleepy;
        winner="Sleepy";
    }
    if(sneezy>most){
        most=sneezy;
        winner="Sneezy";
    }
    if(happy>most){
        most=happy;
        winner="Happy";
    }
    if(doc>most){
        most=doc;
        winner="Doc";
    }

    twin=most-1;

    System.out.println(winner+" was the name with "+twin+" matches!");
}
}