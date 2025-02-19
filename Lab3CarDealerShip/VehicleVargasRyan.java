package CSC331.Lab3CarDealerShip;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class VehicleVargasRyan {
    private String vin;
    private String make;
    private String model;
    private int year;
    private String engineType;
    private String transmission;
    private double cost;
    private double milage;

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

    public VehicleVargasRyan() {
        this.vin = generateVIN();
    }

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
            }else {
                int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
                vin += randomNum; // Concatenating using +=
            }
        }
        return vin;
    }


    public String getVin() {
    return vin;
}

    public String getMake(){ return make;}

    public String getModel(){ return model;}

    public int getYear(){ return year;}

    public String getEngineType(){ return engineType;}

    public String getTransmission(){ return transmission;}

    public double getCost(){ return cost;}

    public double getMilage(){ return milage;}

    public void setCose(double cost){ this.cost = cost;}

    public void setMilage(double milage){ this.milage = milage;}

}

