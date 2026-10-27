/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman TM= new Spiderman("Tobey Maguire", 48, "Green Goblin");
		TM.fight();
		Spiderman AG= new Spiderman("Andrew Garfeild", 40, "Electro");
		AG.fight();
		Spiderman TH= new Spiderman("Tom Holland", 27, "The Vulture");
		TH.fight();
		Spiderman MP= new Spiderman("Mr. Poole", 100, "Potato Jim Joe Bob");
		MP.fight();
		MP.printArt(); 

		
	}
}
