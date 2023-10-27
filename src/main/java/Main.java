/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {
//whileloop

  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter you number")
  int guess = scanner.nextInt();

  int max = 15;
  int randomNumber = (int) (Math.random() * max);
//if else statement
  public static void main(String[] args) {
    int guess = randomNumber;
    if (guess < 6) {
      System.out.println("too small");
    } else if (guess > 8) {
      System.out.println("too large");
    }  else {
      System.out.println("correct guess");
    }
  }
}

//random number for user input

    public static void main(String[] args){
        
    }
}
