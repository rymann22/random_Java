import java.util.*;

public class numSmallestLargest {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);       
      int smallestNum, largestNum, sumTotal, inputNum;
      sumTotal = 0;
      smallestNum = Integer.MAX_VALUE;
      largestNum = Integer.MIN_VALUE;
      while (true) {
        inputNum = scnr.nextInt();
        //inputNum += inputNum;
        if (inputNum < 0 ) {
          break;
        }
        sumTotal += inputNum;
        if (inputNum < smallestNum ) {
          smallestNum = inputNum;
        }
        if (inputNum > largestNum ) {
          largestNum = inputNum;
        }
        //System.out.println("Small: " + smallestNum);
        //System.out.println("Large: " + largestNum);
        
      }
    System.out.println("Sum: " + sumTotal);
    System.out.println("Smallest Num: " + smallestNum);
    System.out.println("Largest Num: " + largestNum);
  }
}
