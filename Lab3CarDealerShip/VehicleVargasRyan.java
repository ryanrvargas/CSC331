package Lab3CarDealerShip;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Represents a vehicle in the dealership inventory.
 * Each vehicle has attributes such as make, model, year, engine type, transmission, cost, and mileage.
 * A VIN (Vehicle Identification Number) is automatically generated upon creation.
 */
public class VehicleVargasRyan {
    private String vin;
    private String make;
    private String model;
    private int year;
    private String engineType;
    private String transmission;
    private double cost;
    private double milage;

    /**
     * Constructs a new vehicle with the specified attributes and generates a VIN.
     *
     * @param make         The make of the vehicle (e.g., Toyota, Ford).
     * @param model        The model of the vehicle (e.g., Camry, F-150).
     * @param year         The manufacture year of the vehicle.
     * @param engineType   The type of engine (e.g., Gas, Diesel, Electric).
     * @param transmission The transmission type (e.g., Automatic, Manual).
     * @param cost         The cost of the vehicle.
     * @param milage       The mileage of the vehicle.
     */
    public VehicleVargasRyan(String make, String model, int year, String engineType, String transmission, double cost, double milage) {
        // Correctly assigning parameters to instance variables
        this.make = make;
        this.model = model;
        this.year = year;
        this.engineType = engineType;
        this.transmission = transmission;
        this.cost = cost;
        this.milage = milage;

        // Generate a VIN when a new vehicle is created
        this.vin = generateVIN();
    }

    /**
     * Default constructor that initializes a vehicle with a randomly generated VIN.
     */
    public VehicleVargasRyan() {
        this.vin = generateVIN();
    }

    /**
     * Generates a 17-character VIN using random numbers and letters while avoiding 'I' and 'O'.
     *
     * @return A unique 17-character VIN.
     */
    private String generateVIN() {
        /*
         * Generates a 17-character VIN with random numbers and letters while avoiding 'I' and 'O'.
         */
        String vin = ""; // Using a standard String instead of StringBuilder
        char character;
        Random rand = new Random();

        for (int i = 0; i < 17; i++) {
            if (i < 1) { // First character random number
                int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
                vin += randomNum; // Concatenating using +=
            } else if (i < 5){ // Remaining characters can be numbers or letters (excluding 'I' and 'O')
                do {
                    character = (char) ('A' + ThreadLocalRandom.current().nextInt(26)); // A-Z
                } while (character == 'I' || character == 'O'); // Skip 'I' and 'O'
                vin += character;
            } else if (i < 7){
                int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
                vin += randomNum; // Concatenating using +=
            } else if (i < 11) {
                do {
                    character = (char) ('A' + ThreadLocalRandom.current().nextInt(26)); // A-Z
                } while (character == 'I' || character == 'O'); // Skip 'I' and 'O'
                vin += character;
            } else {
                int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
                vin += randomNum; // Concatenating using +=
            }
        }
        return vin;
    }

    /**
     * Gets the VIN of the vehicle.
     *
     * @return The vehicle's VIN.
     */
    public String getVin() {
        return vin;
    }

    /**
     * Gets the make of the vehicle.
     *
     * @return The make of the vehicle.
     */
    public String getMake() {
        return make;
    }

    /**
     * Gets the model of the vehicle.
     *
     * @return The model of the vehicle.
     */
    public String getModel() {
        return model;
    }

    /**
     * Gets the manufacture year of the vehicle.
     *
     * @return The year of the vehicle.
     */
    public int getYear() {
        return year;
    }

    /**
     * Gets the engine type of the vehicle.
     *
     * @return The engine type (e.g., Gas, Diesel, Electric).
     */
    public String getEngineType() {
        return engineType;
    }

    /**
     * Gets the transmission type of the vehicle.
     *
     * @return The transmission type (e.g., Automatic, Manual).
     */
    public String getTransmission() {
        return transmission;
    }

    /**
     * Gets the cost of the vehicle.
     *
     * @return The cost of the vehicle.
     */
    public double getCost() {
        return cost;
    }

    /**
     * Gets the mileage of the vehicle.
     *
     * @return The mileage of the vehicle.
     */
    public double getMilage() {
        return milage;
    }

    /**
     * Sets the cost of the vehicle.
     *
     * @param cost The new cost of the vehicle.
     */
    public void setCose(double cost) {
        this.cost = cost;
    }

    /**
     * Sets the mileage of the vehicle.
     *
     * @param milage The new mileage of the vehicle.
     */
    public void setMilage(double milage) {
        this.milage = milage;
    }
}
