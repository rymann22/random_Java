// Mazda.java
public class Mazda {
    public void describeCar() {
        System.out.println("This is a car made by Mazda.");
    }

    public static void main(String[] args) {
        // Create instances of Miata and RX7
        Miata miata = new Miata();
        RX7 rx7 = new RX7();

        // Call their methods
        System.out.println("Miata Description:");
        miata.describeCar();
        miata.displayFeatures();

        System.out.println("\nRX7 Description:");
        rx7.describeCar();
        rx7.displayFeatures();
    }
}

