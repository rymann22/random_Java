import java.util.*;

public class diceGame {
    public static void diceRoll(Random rand) {
      //int randomInt = rand.nextInt();
      //return randomInt == 1;
      int lower = 1, upper = 6;
      int randomInRange = rand.nextInt(upper - lower + 1) + lower;
      return randomInRange;
      //System.out.println("Random number (50-100): " + randomInRange);

    }
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);       
      Random rand = new Random(); // Create an instance of Random
      
      System.out.println(randomInRange);
  }
}
