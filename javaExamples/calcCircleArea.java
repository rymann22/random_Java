import java.util.*;

public class Main {
    public static double calcCircleArea() {
      Scanner scnr = new Scanner(System.in);
      double circleDiameter, circleRadius, circleArea, piVal = 3.14159265;
      
      //circleDiameter = 12.0;
      System.out.print("Enter circle diameter: ");
      circleDiameter = scnr.nextDouble();
      circleRadius = circleDiameter / 2.0;
      circleArea = piVal * circleRadius * circleRadius;
      return circleArea;
    }
    public static void main(String[] args) {
      
      System.out.println("The circle is " + calcCircleArea() + " inches squared");
  }
}


