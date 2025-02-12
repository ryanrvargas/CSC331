package Lab3CarDealerShip;

import java.util.Scanner;


public class DealershipVargasRyan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VehicleVargasRyan BMW = new VehicleVargasRyan();
        VehicleVargasRyan[] cars = {
                new VehicleVargasRyan("BMW", "M3", 2023, "Gas", "Automatic", 75000, 0),
                new VehicleVargasRyan("Toyota", "Camry", 2022, "Gas", "Automatic", 28000, 15000),
                new VehicleVargasRyan("Honda", "Civic", 2021, "Gas", "Manual", 22000, 20000),
                new VehicleVargasRyan("Ford", "F-150", 2020, "Gas", "Automatic", 45000, 30000),
                new VehicleVargasRyan("Chevrolet", "Silverado", 2019, "Gas", "Automatic", 42000, 40000),
                new VehicleVargasRyan("Tesla", "Model 3", 2023, "Electric", "Automatic", 55000, 5000),
                new VehicleVargasRyan("Jeep", "Wrangler", 2022, "Gas", "Manual", 39000, 12000),
                new VehicleVargasRyan("Nissan", "Altima", 2021, "Gas", "Automatic", 25000, 18000),
                new VehicleVargasRyan("Volkswagen", "Jetta", 2020, "Gas", "Automatic", 23000, 25000),
                new VehicleVargasRyan("Mercedes", "C-Class", 2019, "Gas", "Automatic", 48000, 35000),
                new VehicleVargasRyan("Audi", "A4", 2023, "Gas", "Automatic", 50000, 1000),
                new VehicleVargasRyan("Subaru", "Outback", 2022, "Gas", "Automatic", 34000, 17000),
                new VehicleVargasRyan("Dodge", "Ram 1500", 2021, "Gas", "Automatic", 46000, 22000),
                new VehicleVargasRyan("Hyundai", "Elantra", 2020, "Gas", "Automatic", 21000, 27000),
                new VehicleVargasRyan("Mazda", "CX-5", 2019, "Gas", "Automatic", 32000, 38000),
                new VehicleVargasRyan("Ford", "Explorer", 2023, "Gas", "Automatic", 52000, 8000),
                new VehicleVargasRyan("Chevrolet", "Tahoe", 2022, "Gas", "Automatic", 60000, 11000),
                new VehicleVargasRyan("Honda", "Accord", 2021, "Gas", "Automatic", 27000, 19000),
                new VehicleVargasRyan("Toyota", "Rav4", 2020, "Gas", "Automatic", 31000, 23000),
                new VehicleVargasRyan("GMC", "Sierra", 2019, "Diesel", "Automatic", 48000, 36000)};

        System.out.printf("Enter vehicle Vargas: %s", BMW.getVin());

        displayMenu();
    }

    public static void displayMenu(){
        System.out.println("Car Dealership Inventory System:%n" +
                "1. Add a vehicle%n" +
                "2. View Inventory%n" +
                "3. Search Inventory%n" +
                "4. Calculate Vehicle From Inventory%n" +
                "5. Remove Vehicle From Inventory%n" +
                "6. Exit%n");
    }

}
