import java.util.*;

public class nameSplit {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);       
      String fullName = scnr.nextLine();
      System.out.println("Full name: " + fullName);
      String[] nameSplit = fullName.split(" ");
      if (nameSplit.length == 2 ) {
        System.out.println("Last, First.: " + nameSplit[1] + " " + nameSplit[0]);
        System.out.println("L., First: " + nameSplit[1].charAt(0) + "., " + nameSplit[0]);
        //System.out.println("First name: " + nameSplit[0]);
        //System.out.println("Last name: " + nameSplit[1]); 
      } else {
        System.out.println("Last, First M.: " + nameSplit[2] + ", " + nameSplit[0] + " " + nameSplit[1].charAt(0) + ".");
        //System.out.println("First name: " + nameSplit[0]);
        //System.out.println("Middle initial: " + nameSplit[1].charAt(0));
        //System.out.println("Middle name: " + nameSplit[2]);
      }
  }
}


