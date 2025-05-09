package Lab3CarDealerShip;

import java.util.Scanner;


public class DealershipVargasRyan {
    public static Scanner scanner = new Scanner(System.in);
    //Array of vehicles representing the dealership's inventory
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
    /**
     * The main entry point for the car dealership system.
     * Handles user interactions and menu selection.
     *
     * @param args Command-line arguments (unused)
     */
    public static void main(String[] args) {


        displayMenu();
        DealershipVargasRyan dealership = new DealershipVargasRyan();
        viewInventory(dealership.cars);
        displayMenu();
        VehicleVargasRyan car = new VehicleVargasRyan();
        //dealership.addVehicle(car);
        //viewInventory(dealership.cars);
        System.out.println("TEST");
        //dealership.removeVehicle();
        viewInventory(dealership.cars);
        dealership.searchInventory(dealership.cars);
        int user;
        do {
            displayMenu();
            user = scanner.nextInt();
            scanner.nextLine();//Consume newline
            switch (user) {
                case 1:
                    dealership.addVehicle(car);
                    break;
                case 2:
                    viewInventory(dealership.cars);
                    break;
                case 3:
                    dealership.searchInventory(dealership.cars);
                    break;
                case 4:
                    dealership.calculateSalesPrice(dealership.cars);
                    break;
                case 5:
                    dealership.removeVehicle();

            }
        }while(user != 5);



    }
    /**
     * Displays the main menu for the dealership system.
     */
    public static void displayMenu(){
        System.out.printf("Car Dealership Inventory System:%n" +
                "1. Add a vehicle%n" +
                "2. View Inventory%n" +
                "3. Search Inventory%n" +
                "4. Calculate Vehicle From Inventory%n" +
                "5. Remove Vehicle From Inventory%n" +
                "6. Exit%n");
    }
    /**
     * Displays the current inventory of vehicles.
     *
     * @param cars The array of vehicles to display
     */
    public static void viewInventory(VehicleVargasRyan[] cars) {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-6s %-10s %-12s %-10s %-10s%n",
                "VIN", "Make", "Model", "Year", "Engine Type", "Transmission", "Cost ($)", "Mileage (miles)");
        System.out.println("------------------------------------------------------------------------------------");

        // Print each vehicle in formatted columns
        for (VehicleVargasRyan car : cars) {
            System.out.printf("%-20s %-10s %-10s %-6d %-10s %-12s $%-10.2f %-10.1f%n",
                    car.getVin(), car.getMake(), car.getModel(), car.getYear(),
                    car.getEngineType(), car.getTransmission(), car.getCost(), car.getMilage());

        }
    }
    /**
     * Adds a new vehicle to the inventory.
     *
     * @param car The vehicle to add
     */
    public void addVehicle(VehicleVargasRyan car){
        VehicleVargasRyan[] temp = new VehicleVargasRyan[cars.length + 1];

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

        System.out.println("Vehicle added to inventory.");

    }
    /**
     * Removes a vehicle from the inventory by VIN.
     */
    public void removeVehicle() {
        System.out.println("Enter VIN of vehicle to remove: ");
        String user = scanner.nextLine();

        int index = -1;

        //Find the index of the vehicle to remove
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getVin().equals(user)) {
                index = i;
                break;
            }
        }

        //If VIN was not found print a message and exit the method
        if (index == -1) {
            System.out.println("Vehicle with VIN " + user + " not found.");
            return;
        }

        //Create a new array with one less size
        VehicleVargasRyan[] temp = new VehicleVargasRyan[cars.length - 1];

        //Copy all elements except the one to remove
        for (int i = 0, j = 0; i < cars.length; i++) {
            if (i == index) continue; // Skip the vehicle to remove
            temp[j++] = cars[i]; // Increment j only when adding an element
        }

        //Assign the new array to cars
        cars = temp;

        System.out.println("Vehicle removed from inventory.");
    }
    /**
     * Searches for a vehicle in the inventory by make, model, year, or VIN.
     *
     * @param cars The array of vehicles to search
     */
    public void searchInventory(VehicleVargasRyan[] cars) {

        int input;
        do {
            System.out.printf("1.Search vehicle by make%n2.Search by model%n3.Search by year%n4.Search by vin%n5.Exit%n");
            input = scanner.nextInt();
            scanner.nextLine();
            boolean found = false;
            switch (input) {
                case 1:
                    System.out.println("Enter vehicle make: ");
                    String make = scanner.nextLine();
                    for (VehicleVargasRyan car : cars) {
                        if (car.getMake().equalsIgnoreCase(make)) {
                            System.out.printf("Make: %s, Model: %s, Year: %d, Vin: %s%n", car.getMake(), car.getModel(), car.getYear(), car.getVin());
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No matching vehicles found.");
                    }
                    break;
                    case 2:
                        System.out.println("Enter vehicle model: ");
                        String model = scanner.nextLine();
                        for (VehicleVargasRyan car : cars) {
                            if (car.getModel().equalsIgnoreCase(model)) {
                                System.out.printf("Make: %s, Model: %s, Year: %d, Vin: %s%n", car.getMake(), car.getModel(), car.getYear(), car.getVin());
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("No matching vehicles found.");
                        }
                        break;
                        case 3:
                            System.out.println("Enter vehicle year: ");
                            int year = scanner.nextInt();
                            for (VehicleVargasRyan car : cars) {
                                if (String.valueOf(car.getYear()).equals(String.valueOf(year))) {
                                    System.out.printf("Make: %s, Model: %s, Year: %d, Vin: %s%n", car.getMake(), car.getModel(), car.getYear(), car.getVin());
                                    found = true;
                                }
                            }
                            if (!found) {
                                System.out.println("No matching vehicles found.");
                            }
                            break;
                            case 4:
                                System.out.println("Enter vehicle vin: ");
                                String vin = scanner.nextLine();
                                for (VehicleVargasRyan car : cars) {
                                    if (car.getVin().equalsIgnoreCase(vin.toLowerCase())) {
                                        System.out.printf("Make: %s, Model: %s, Year: %d, Vin: %s%n", car.getMake(), car.getModel(), car.getYear(), car.getVin());
                                        found = true;
                                    }
                                }
                                if (!found) {
                                    System.out.println("No matching vehicles found.");
                                }
                                break;

            }
        } while (input != 5);
    }
    /**
     * Calculates the sales price, loan details, and monthly payment for a selected vehicle.
     *
     * @param cars The array of vehicles to search for sales price calculation
     */
    public void calculateSalesPrice(VehicleVargasRyan[] cars) {
        System.out.println("Enter vehicle vin: ");
        String vin = scanner.nextLine();
        boolean found = false;
        for (VehicleVargasRyan car : cars) {
            if (car.getVin().equalsIgnoreCase(vin)) {
                found = true;

                // Display vehicle details
                System.out.println("\nVehicle Selected:");
                System.out.println("\nVehicles Found:");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.printf("%-20s %-10s %-10s %-5s %-12s %-12s %-10s %-10s%n",
                        "VIN", "Make", "Model", "Year", "Engine Type", "Transmission", "Cost ($)", "Mileage (miles)");
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.printf("%-20s %-10s %-10s %-5d %-12s %-12s $%-10.2f %-10.1f%n",
                        car.getVin(), car.getMake(), car.getModel(), car.getYear(),
                        car.getEngineType(), car.getTransmission(), car.getCost(), car.getMilage());

                // Get user inputs
                System.out.print("\nEnter Tax Rate (as %): ");
                double rate = scanner.nextDouble();
                rate /= 100.0; // Convert to decimal

                System.out.print("Enter Down Payment ($): ");
                double downpayment = scanner.nextDouble();

                System.out.print("Enter APR (as %): ");
                double apr = scanner.nextDouble();
                apr /= 100.0; // Convert to decimal

                System.out.print("Enter Loan Term (months): ");
                int months = scanner.nextInt();

                // Calculate financing details
                double totalPrice = car.getCost() * (1 + rate); // Tax added to base price
                double loanAmount = totalPrice - downpayment;
                double monthlyRate = apr / 12.0;
                double monthlyPayment = (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months));

                // Display financing details
                System.out.println("\n---------------------------------------------------");
                System.out.println("                 *  FINANCING DETAILS  *          ");
                System.out.println("---------------------------------------------------");
                System.out.printf("Base Price ($):         %10.2f%n", car.getCost());
                System.out.printf("Tax Rate:               %10.2f%%%n", rate * 100);
                System.out.printf("Total Price ($):        %10.2f%n", totalPrice);
                System.out.printf("Down Payment ($):       %10.2f%n", downpayment);
                System.out.printf("Loan Amount ($):        %10.2f%n", loanAmount);
                System.out.printf("APR:                    %10.2f%%%n", apr * 100);
                System.out.printf("Loan Term (Months):     %10d%n", months);
                System.out.printf("Monthly Payment ($):    %10.2f%n", monthlyPayment);
                System.out.println("---------------------------------------------------");

            }
        }
    }
}
