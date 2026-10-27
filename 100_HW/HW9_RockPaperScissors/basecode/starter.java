/*
 *	Author: Jaden Zheng
 *  Date:10/22/26
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static String getObject(){
            int roll=(int)(Math.random()*3);
            String role="";
              if(roll==0){
                 role="rock";
            }
            if(roll==1){
                role="paper";
            }
            if(roll==2){
                role="scissors";
            }
            return role;
        }
        public static int compare2(String player1, String player2){
            if (player1.equalsIgnoreCase(player2)){
                return 0;
            }
            else if((player1.equalsIgnoreCase("rock")&&player2.equalsIgnoreCase("scissors"))||(
                player1.equalsIgnoreCase("scissors")&&player2.equalsIgnoreCase("paper"))||
                (player1.equalsIgnoreCase("paper")&&player2.equalsIgnoreCase("rock")))
                {
                    return 1;
                }
            else{
                return 2;
            }
        }
    public static void main(String[] args) {
    int y=0;
    String player1="rock";
    String player2="paper";
    Scanner sc=new Scanner(System.in);
    int win=0;
    while(y==0){
        System.out.println("Would you like to play the computer? (yes/no/done)");
        String isPlay=sc.nextLine();
        System.out.println();
     
            if(isPlay.equalsIgnoreCase("yes")){
            System.out.println("Please enter rock/paper/scissors: ");
            player1=sc.nextLine();
                if(!player1.equalsIgnoreCase("rock")&&!player1.equalsIgnoreCase("paper")&&!player1.equalsIgnoreCase("scissors")){
                System.out.println("Please try again");
                continue;
            }
              player2=getObject();
            win=compare2(player1, player2);
                if(win==0){
                System.out.println("You tied.");
            }
                else if(win==1){
                System.out.println("You won!");
            }
                else{
                System.out.println("You lost.");
            }
            
           
        }
        else if(isPlay.equalsIgnoreCase("no")){
            System.out.println("How many times would you like the computer to play itself?");
            int play=sc.nextInt();
            sc.nextLine();
            int wins=0;
            int losses=0;
            int ties=0;
            while(play!=0){
                player1=getObject();
                player2=getObject();
                win= compare2(player1,player2);
                 if(win==0){
                ties++;
             }
                else if(win==1){
                losses++;
            }
                else{
                wins++;
            }
                play--;
            
            }
            System.out.println("Player 1 wins: "+wins);
            System.out.println("Player 2 wins: "+losses);
            System.out.println("Ties: "+ties);
        }
       else if(isPlay.equalsIgnoreCase("done")){
            y+=1;
            break;
        }
       else{
        System.out.println("Invalid Input");
       }
    }
    }
}
