//----------------------------
// Java ArrayList
//----------------------------
// import the ArrayList package
import java.util.ArrayList;

// create an ArrayList called students
ArrayList<String> students = new ArrayList<String>();

//----------------------------
// Index
//----------------------------
int[] marks = {50, 55, 60, 70, 80};

System.out.println(marks[0]);
// Output: 50

System.out.println(marks[4]);
// Output: 80

//----------------------------
// Arrays
//----------------------------
// Create an array of 5 int elements
int[] marks = {10, 20, 30, 40, 50};

//----------------------------
// Array creation in Java
//----------------------------
int[] age = {20, 21, 30};

int[] marks = new int[3];
marks[0] = 50; 
marks[1] = 70;
marks[2] = 93;

//----------------------------
// Changing an Element Value
//----------------------------
int[] nums = {1, 2, 0, 4};
// Change value at index 2
nums[2] = 3;

//----------------------------
// Modify ArrayLists in Java
//----------------------------
import java.util.ArrayList;

public class Students {
  public static void main(String[] args) {
    
     // create an ArrayList called studentList, which initially holds []
		ArrayList<String> studentList = new ArrayList<String>();
    
    // add students to the ArrayList
    studentList.add("John");
    studentList.add("Lily");
    studentList.add("Samantha");
    studentList.add("Tony");
    
    // remove John from the ArrayList, then Lily
    studentList.remove(0);
    studentList.remove("Lily");
    
    // studentList now holds [Samantha, Tony]
    
    System.out.println(studentList);
  }
}