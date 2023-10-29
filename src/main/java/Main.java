/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
public class Main {



  public static void main(String[] args) { // must write code in side here below
    // Scanner to add user input
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter your guess 1 to 15:");
    int guess = scanner.nextInt();
    // the max number you can guess
    int max = 15;
    //random number for game
    int randomNumber = (int) (Math.random() * max);
    //the number of try a person try's to guess.
    int trycounter = 0; //add a to player try counter

    while(true) {
//if else statement

      if (guess < randomNumber) {
        System.out.println("too small");
        trycounter++;// add one to every time the loop rests.
        guess = scanner.nextInt();// this pause the loop and allows u to enter another guess. restarting the loop.
      } else if (guess > randomNumber) {
        System.out.println("too large");
        guess = scanner.nextInt();// this pause the loop and allows u to enter another guess. restarting the loop.
      } else {
        System.out.println("correct guess !! " + "it took: " +  trycounter +" tries!");
        // if correct print out statement and amount of tries.
        break;// this stops the loop.


      }
    }
  }

}