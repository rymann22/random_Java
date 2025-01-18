import java.util.Scanner;

public class average_double {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      /* Type your code here. */
      double[] inputArray = new double[3];
      double arrayAverage;
      System.out.println("Enter 3 doubles. Hit enter after each double");
      System.out.print("Enter first double: ");
      inputArray [0] = scnr.nextDouble();
      System.out.print("Enter second double: ");
      inputArray [1] = scnr.nextDouble();
      System.out.print("Enter third double: ");
      inputArray [2] = scnr.nextDouble();
      System.out.println("The length of the array is: " + inputArray.length);
      System.out.println("Array item 1: " + inputArray[0]);
      System.out.println("Array item 2: " + inputArray[1]);
      System.out.println("Array item 3: " + inputArray[2]);
      arrayAverage = (( inputArray[0] + inputArray[1] + inputArray[2] ) / 3 );

      // System.out.println("Array average: " + arrayAverage );
      System.out.printf("Array average: %.1f\n", arrayAverage );

    scnr.close();
   }
}
