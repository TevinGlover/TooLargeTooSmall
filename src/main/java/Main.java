/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
public class Main {

  // Scanner to add user input
  Scanner scanner = new Scanner(System.in);
  System.out.println("enter your guess 1 to 15")
  static int guess = scanner.nextInt();
  // the max number you can guess
  int max = 15;
  //random number for game
  int randomNumber = (int) (Math.random() * max);

  public static void main(String[] args) {
    while (true) {
//if else statement
      if (guess < randomNumber) {
        System.out.println("too small");
      } else if (guess > randomNumber) {
        System.out.println("too large");
      } else {
        System.out.println("correct guess" );
        break;
      }
    }
  }
}