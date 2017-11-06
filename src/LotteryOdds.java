/**
 * ISYS-320-w1
 * author: Samantha Rutherford
 * date: November 5th, 2017
 **/

import java.math.BigInteger;
import java.util.Scanner;

public class Lottery {

  public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      int poolSize = 30;

      // Prompt user to input the numbers to draw for the lottery.
      System.out.print("Choose the numbers to draw, bro!\n Nothing greater than 5:\t");
      int n = scan.nextInt(); //to input integer between 1-5.
      if (n <= 5)
      {
          BigInteger Lottery = BigInteger.valueOf(1);
          for (int i=1; i<=n; i++)
            Lottery = Lottery.multiply(BigInteger.valueOf(poolSize - i + 1)).divide(BigInteger.valueOf(i));
          System.out.println("The odds of winning the lottery are 1 in " + Lottery + ". Good luck! You'll lose. Its rigged... xD")
      }
      else
        System.out.println("Sorry. I said nothing greater than 5! You lose.")


  }

}
