// MazdaDemo.java
public class mazdaDemo {
    public static void main(String[] args) {
        // Create an array of Mazda cars
        mazda[] cars = { new miata(), new rx7(), new rc787B() };

        // Loop through the cars and display their details
        for (mazda car : cars) {
            car.describeCar();
            car.displayFeatures();
            System.out.println(); // Add space between car descriptions
        }
    }
}

