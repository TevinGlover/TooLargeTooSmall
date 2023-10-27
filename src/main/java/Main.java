/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {
//whileloop
// Scanner to add user input
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter your number")
  int guess = scanner.nextInt();
  // the max number you can guess
  int max = 15;
  int randomNumber = (int) (Math.random() * max);
//if else statement
  public static void main(String[] args) {
    if (guess < randomNumber) {
      System.out.println("too small");
    } else if (guess > randomNumber) {
      System.out.println("too large");
    }  else {
      System.out.println("correct guess");
    }
  }
}

//random number for user input
