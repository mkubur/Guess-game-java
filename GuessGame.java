/*The GuessGame program plays a guessing game. The program will choose a "random"
number between 1-20 and give the you a chance to guess the number. You will be
given an unlimited number of guesses and on each guess, you will be told
whether your guess is too high, too low, or correct. You will have the chance
to repeat the game as many times you wish.

@author Mohammed Kubur
@version 1.0
*/

import java.util.Random;
import java.util.Scanner;
public class GuessGame
{
    public static void main(String[] args) {

        // declaring varibles to hold values will be used

        String welcomeMsg = "\nWelcome to the Guess Game.\nLet's begin..\n ";
        String repeatMsg = "\nWould you like to guess another number (y/n)?";
        String goodbyeMsg = "Thanks for playing the GuessGame!";
        String playAgain = "y";
        int guess;
        boolean retry = true;

        // create scanner object to take user input

        Scanner keyboard = new Scanner(System.in);

        // create object of random number generator
        Random rand = new Random();
        System.out.println(welcomeMsg);

        // the first while loop is to repeat the whole game

        while (playAgain.equalsIgnoreCase("y")){
            int randNum = rand.nextInt(20) +1;
            retry = true;
            // second loop to let the user guess as many times.
            while (retry) {

                System.out.print("Guess a number between 1-20:  ");
                guess = keyboard.nextInt();
                keyboard.nextLine();

                // the first if validates user entry if between  1 to 20
                if (guess < 1 || guess > 20 ){
                    System.out.println("\nThe number should be between 1 and 20");
                }
               else if (guess == randNum){
                    System.out.println("Your guess is correct!");
                    System.out.println(repeatMsg);
                    playAgain = keyboard.nextLine();
                    retry = false;
                }
                else if (guess < randNum) {
                    System.out.println("\nYour guess is too low. Try again.\n");
                }
                else {
                    System.out.println("\nYour guess is too high. Try again.\n");
                }
            }
        }
        keyboard.close();
        System.out.println("\n"+goodbyeMsg+"\n");
    }
}
