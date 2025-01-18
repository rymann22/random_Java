import java.util.*;

public class diceGame_twoPlayer {

    // Method to simulate a dice roll (1-6)
    public static int rollDice() {
        // Generate a random number between 1 and 6
        int result = (int) (Math.random() * 6) + 1;
        return result; // Return the result to the caller
    }

    public static void main(String[] args) {
        // Call the rollDice method and store the returned value
        Scanner scnr = new Scanner(System.in);
        int diceRoll = rollDice();

        // Print the dice roll result
        System.out.print("Enter player 1 name: ");
        String playerOne = scnr.nextLine();
        System.out.print("Enter player 2 name: ");
        String playerTwo = scnr.nextLine();
        System.out.print("Enter player 3 name: ");
        String playerThree = scnr.nextLine();
        System.out.println("");

        int playerOneRoll = rollDice();
        int playerTwoRoll = rollDice();
        int playerThreeRoll = rollDice();

        System.out.println(playerOne + " rolled a : " + playerOneRoll);
        System.out.println(playerTwo + " rolled a : " + playerTwoRoll);
        System.out.println(playerThree + " rolled a : " + playerThreeRoll);
        System.out.println("");
        
        // Call it multiple times if needed
        if (playerOneRoll > playerTwoRoll && playerOneRoll > playerThreeRoll) {
            //System.out.println(playerOneRoll + " is greater than " + playerTwoRoll + " and " + playerThreeRoll);
            System.out.println(playerOne + " wins!");
        } else if (playerTwoRoll > playerOneRoll && playerTwoRoll > playerThreeRoll) {
            //System.out.println(playerTwoRoll + " is greater than " + playerOneRoll + " and " + playerThreeRoll);
            System.out.println(playerTwo + " wins!");
        } else if (playerThreeRoll > playerOneRoll && playerThreeRoll > playerTwoRoll) {
            //System.out.println(playerThreeRoll + " is greater than " + playerOneRoll + " and " + playerTwoRoll);
            System.out.println(playerThree + " wins!");
        } else {
            System.out.println("All players win!");
        }
    }
}

