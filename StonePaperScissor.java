//Basic Stone,Paper,Scissor Game

import java.util.*;

public class StonePaperScissor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int compscore=0;
        int userscore=0;
        System.out.print("Enter the Number of rounds to play: ");

        int n= sc.nextInt();
        int i=0;

        while(i<n){

        int comp= random.nextInt(1,3);

        System.out.println("Choose : \n1 for Stone\n2 for Paper\n3 for Scissor");
        System.out.print("\nYour choice = ");
        int user=sc.nextInt();

        System.out.print("Computer chose : ");
        System.out.print(comp);
        if(comp==1){
            System.out.println(" for Stone ");
        }
        else if(comp==2){
            System.out.println(" for Paper");
        }
        else if(comp==3){
            System.out.println(" for Scissor");
        }
        System.out.println();
        if(comp==user){
            System.out.println("! DRAW !");

        }
        else if(comp==1 && user==3 || comp==2 && user==1 || comp==3 && user==2){
            System.out.println("Computer 1 point scored !");
            compscore++;
        }

        else{
            System.out.println("You win !! ");
            userscore++;
        }
            System.out.println();
            System.out.println("Your score is = " + userscore);
            System.out.println("Computer score is = " + compscore);

        i++;
    }
    System.out.println();
    if(compscore==userscore){
        System.out.println("RESULT : DRAW");
    }else{
    String result=(userscore>compscore)?"You are the Winner!":"Computer Won! You Lose..Play again!";
    System.out.println(result);
}}}
