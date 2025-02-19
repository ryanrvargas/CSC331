package Lab3CarDealerShip;

import java.util.Scanner;


public class DealershipVargasRyan {
    public VehicleVargasRyan[] cars = {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displayMenu();
        DealershipVargasRyan dealership = new DealershipVargasRyan();
        viewInventory(dealership.cars);
        displayMenu();
        VehicleVargasRyan car = new VehicleVargasRyan();
        dealership.addVehicle(car);
        viewInventory(dealership.cars);

    }

    public static void displayMenu(){
        System.out.printf("Car Dealership Inventory System:%n" +
                "1. Add a vehicle%n" +
                "2. View Inventory%n" +
                "3. Search Inventory%n" +
                "4. Calculate Vehicle From Inventory%n" +
                "5. Remove Vehicle From Inventory%n" +
                "6. Exit%n");
    }

    public static void viewInventory(VehicleVargasRyan[] cars){
        for (VehicleVargasRyan car : cars) {
            System.out.printf("Make: %s, Model: %s, Year: %d, VIN: %s%n",
                    car.getMake(), car.getModel(), car.getYear(), car.getVin());
        }
    }

    public void addVehicle(VehicleVargasRyan car){
        VehicleVargasRyan[] temp = new VehicleVargasRyan[cars.length + 1];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vehicle make: ");
        String make = scanner.nextLine();
        System.out.println("Enter vehicle model: ");
        String model = scanner.nextLine();
        System.out.println("Enter vehicle year: ");
        int year = scanner.nextInt();
        scanner.nextLine();//Consumes the leftover of the newline
        System.out.println("Enter vehicle engine type: ");
        String engineType = scanner.nextLine();
        System.out.println("Enter vehicle transmission type: ");
        String transmissionType = scanner.nextLine();
        System.out.println("Enter vehicle cost: ");
        double cost = scanner.nextDouble();
        System.out.println("Enter vehicle mileage: ");
        int mileage = scanner.nextInt();

        car = new VehicleVargasRyan(make, model, year, engineType, transmissionType, cost, mileage);
        for(int i=0; i<cars.length; i++){
            temp[i] = cars[i];
        }
        temp[cars.length] = car;
        cars = temp;


    }

}
