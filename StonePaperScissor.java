//Basic Stone,Paper,Scissor Game

import java.util.*;

public class StonePaperScissor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int comp= random.nextInt(1,3);

        System.out.println("Choose : \n1 for Stone\n2 for Paper\n3 for Scissor");

        int user=sc.nextInt();

        System.out.print("Computer chose : ");
        System.out.print(comp);
        if(comp==1){
            System.out.println(" for Stone");
        }
        else if(comp==2){
            System.out.println(" for Paper");
        }
        else if(comp==3){
            System.out.println(" for Scissor");
        }
        

        if(comp==user){
            System.out.println("! DRAW !");

        }
        else if(comp==1 && user==3){
            System.out.println("Computer 1 point scored !");
        }

        else if(comp==2 && user==1){
            System.out.println("Computer 1 point scored !");
        }

        else if(comp==3 && user==2){
            System.out.println("Computer 1 point scored !");
        }

        else{
            System.out.println("You win !! ");
        }

        


    }
    
}
