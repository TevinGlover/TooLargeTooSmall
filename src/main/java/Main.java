/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
public class Main {



  public static void main(String[] args) { // must write code in side here below
    // Scanner to add user input
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter your guess 1 to 15");
    int guess = scanner.nextInt();
    // the max number you can guess
    int max = 15;
    //random number for game
    int randomNumber = (int) (Math.random() * max);

    while (true) {
//if else statement
      if (guess < randomNumber) {
        System.out.println("too small");
        continue;
      } else if (guess > randomNumber) {
        System.out.println("too large");
        continue;
      } else {
        System.out.println("correct guess" );
        break;
      }
    }
  }
}