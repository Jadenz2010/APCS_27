/*
 *	Author:  Jaden Zheng
 *  Date: 10/16/26
*/

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

class starter {
	static long startTime = 0;
	static ArrayList<String> arr = new ArrayList<String>();

	public static void main(String args[]) throws InterruptedException {
		// Write your code here!
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Type Quest!");
		System.out.println("It is currently "+getTime()+ " and we're ready to play");
		System.out.println("Given a sentence, type it as fast as possible!");
		int play=1;
		while(play==1||play==2){
		System.out.println("Would you like to: ");
		System.out.println("1-Play Random\n2-Play set\n3-Quit");
		play=sc.nextInt();
		sc.nextLine();
		if(play==1){
			populateArrayList();
			String sent=getSentence();
			System.out.println(sent);
			countdown();
			startTimer();
			String typed =sc.nextLine();
			double timepassed=endTimer();
			int errors=compareSentences(sent,typed);
			int lets=lettersInSentence(sent);
			int wrds=wordsInSentence(sent);
			System.out.println("Nice job! Here is your result!");
			System.out.println("Time: "+timepassed);
			System.out.println("Errors: "+errors+"/"+lets);
			System.out.println((double)(lets)/timepassed+" letters per minute");
			System.out.println((double)(wrds)/timepassed+" words per minute");
		}
		if(play==2){
			populateArrayList();
			System.out.println("Please enter what number sentence you'd like to play:");
			int index=sc.nextInt();
			sc.nextLine();
			String sent =getSentence(index);
			System.out.println(sent);
			countdown();
			startTimer();
			String typed =sc.nextLine();
			double timepassed=endTimer();
			int errors=compareSentences(sent, typed);
			int lets=lettersInSentence(sent);
			int wrds=wordsInSentence(sent);
			System.out.println("Nice job! Here is your result!");
			System.out.println("Time: "+timepassed);
			System.out.println("Errors: "+errors+"/"+lets);
			System.out.println((double)(lets)/timepassed+" letters per minute");
			System.out.println((double)(wrds)/timepassed+" words per minute");
		}
		if (play==3){
			break;
		}
		
	}
	}

	// This method returns the local current time as a String
	public static String getTime(){
		LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return now.format(format);
	}

	// This method starts a clock that can be used throughout the program
	public static void startTimer(){
		startTime = System.nanoTime();
	}

	// This method stops the timer clock and returns a double of the seconds and milliseconds of the stopwatch
	public static double endTimer() throws InterruptedException{
		long endTime = System.nanoTime();
		long timeSeconds = ((endTime - startTime)/1000000);
		double decSeconds = timeSeconds/1000.0;
		return decSeconds;
	}

	// This method does a 3 second countdown and prints it to the terminal
	public static void countdown(){
		System.out.println("Starting countdown...");
		for (int i = 0; i < 3; i++) {
			System.out.println(3-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Go!");
	}

	// This method sets up a list of sentences to be called from. 
	// This should only be called once prior to getting sentences.
	private static void populateArrayList(){
		File f = new File("sentences.txt");
		try(Scanner fsc = new Scanner(f)){
			while(fsc.hasNextLine()){
				arr.add(fsc.nextLine());
			}
		}
		catch(FileNotFoundException e){
			System.err.println("File not found: " + e.getMessage());
		}
	}

	// This chooses 1 of the 100 sentences in the list to return.
	public static String getSentence(){
		populateArrayList();
		int rand = (int)(Math.random()*100);
		return arr.get(rand);
	}

	// This returns the same sentence for the same integer given.
	public static String getSentence(int index){
		populateArrayList();
		return arr.get(index%100);
	}

	//  This returns the number of letters, spaces, and punctuations in a sentence.
	public static int lettersInSentence(String sent){
		return sent.length();
	}
	
	// This returns the number of words in a sentence
	public static int wordsInSentence(String sent){
		int spaceCount = 0;
		while(sent.indexOf(" ") > -1){
			spaceCount++;
			sent = sent.substring(sent.indexOf(" ")+1);
		}
		return ++spaceCount;
	}

	// This method does a letter by letter comparison of each word and returns the number of errors.
	public static int compareSentences(String given, String typed){
		int errors = 0;
		while(given.length() > 0 && typed.length() > 0){
			if(!given.substring(0,1).equals(typed.substring(0,1)))
				errors++;
			given = given.substring(1);
			typed = typed.substring(1);
		}
		return errors;
	}

}
