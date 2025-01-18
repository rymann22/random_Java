import java.util.Scanner; // scanner tool for getting user input

//simple array
public class allCars {
        public static void main(String[] args)
        {
                String[] carBrands = {"Acura", "Honda", "Mazda", "Nissan", "Toyota", "Lexus"};
                int n = carBrands.length;
                for (int i = 0; i < n; i++)
                        System.out.println(carBrands[i] + " ");
                        System.out.println("Total Brands: " + n);
        }
}
