package vehicule;

import java.io.*;
import java.util.ArrayList;

public class VehicleDemoApp {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Demonstration App ===\n");
         try {
            // ================= Standard Car =================
            Car car1 = new Car("Toyota", "Corolla", 2020);
            System.out.println(car1.getBrand());
            car1.showInfo();
            Car.howManyCars();
            // ================= ElectricCar =================
            ElectricCar tesla = new ElectricCar("Tesla", "Model 3", 2023, 75);
            System.out.println(tesla.getBrand());
            tesla.showInfo();
            ElectricCar.howManyCars();
            Car.howManyCars();
            // ================= ArrayList Example =================
            ArrayList<Car> carList = new ArrayList<>();
            carList.add(car1);
            carList.add(tesla);
            System.out.println("\nArrayList Contents:");
            for (Car c : carList) {
                c.showInfo();
            }
            // ================= IO Example =================
            String fileName = "output/output.txt";
            // Write cars to file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (Car c : carList) {
                    writer.write(c.getBrand() + " " + c.model + " " + c.value);
                    writer.newLine();
                }
            }
            // Read cars from file
            System.out.println("\nReading cars from file:");
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n=== Demonstration Complete ===");
    }
}
