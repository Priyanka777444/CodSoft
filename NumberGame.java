import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        System.out.println("Welcome !!");
        System.out.println("GUESS THE NUMBER");
        Scanner sc = new Scanner(System.in);
       
      String play = "yes";
      while (play.equals("yes"))
        {   
          Random ran = new Random();
          int rannumber = ran.nextInt(100);
          int guess = -1;
          int tries = 0;   
        while (guess!=rannumber) {        
          System.out.println("Guess a number between 1 and 100 :");
          guess = sc.nextInt();
          tries++;
        if (guess == rannumber) {
          System.out.println("Congratulation! You win");
          System.out.println("It took you " +tries+ " guesses");
          System.out.println("Would you like to play again ? Yes or No :");
          play = sc.next().toLowerCase();
          }
        else if(guess > rannumber){
          System.out.println("Your guess is high , try again");
          }  
        else{
          System.out.println("Your guess is low , try again ");
          }   
        }
      }
      sc.close();
      System.out.println("Thank you for playing!!");
    }
  }  