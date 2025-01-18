import java.util.*;

public class diceGame_v2 {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);       
      Random rand = new Random(); // Create an instance of Random
      int lower = 1, upper = 6;
      int randomInRange = rand.nextInt(upper - lower + 1) + lower;
      System.out.println("Dice roll: " + randomInRange);

  }
}
