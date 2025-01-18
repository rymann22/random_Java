import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);       
      System.out.println("Enter an int followed by enter three times");
      int inputNum1 = scnr.nextInt();
      int inputNum2 = scnr.nextInt();
      int inputNum3 = scnr.nextInt();
      int inputSum = inputNum1 + inputNum2 + inputNum3;
      String intString = (inputNum1 + "" + inputNum2 + "" + inputNum3);
      int strInt3 = Integer.valueOf(intString);
      //int[] evenNum;
      //int[] oddNum;
      System.out.println("You entered the following numbers: " + inputNum1 + ", " + inputNum2 + ", " + inputNum3);
      if (inputNum1 < 0 || inputNum2 < 0 || inputNum3 < 0 ) {
        System.out.println("Invalid Input!");
      }
      String evenOdd1 = (inputNum1 % 2 == 0 ) ? "even" : "odd";
      String evenOdd2 = (inputNum2 % 2 == 0 ) ? "even" : "odd";
      String evenOdd3 = (inputNum3 % 2 == 0 ) ? "even" : "odd";
      System.out.println("Input number 1: " + inputNum1 + " is " + evenOdd1);
      System.out.println("Input number 2: " + inputNum2 + " is " + evenOdd2);
      System.out.println("Input number 3: " + inputNum3 + " is " + evenOdd3);
      
      System.out.println("The sum of all numbers is: " + inputSum);
      System.out.println("Numbers as a sring: " + intString);
      String divThree = (strInt3 % 3 == 0) ? intString + " is divisible by 3!" : intString + " is not divisible by 3!";
      System.out.println(divThree);
  }
}
