import java.util.ArrayList;
import java.util.Scanner;

public class car_array { 
  public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();
    Scanner scnr = new Scanner(System.in);
    System.out.print("Enter car brand: ");
    String newCar = scnr.nextLine();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.add(newCar);
    for (String i : cars) {
      System.out.println(i);
    }
  } 
}
