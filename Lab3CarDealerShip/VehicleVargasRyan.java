import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class VehicleVargasRyan {
    private String vin;
    private String make;
    private String model;
    private int year;
    private String engineType;
    private String transmission
    private double cost;
    private double milage;

    public VehicleVargasRyan(String make, String model, int year, String engineType, String transmission, double cost, double milage) {
        make = this.make;
        model = this.model;
        year = this.year;
        engineType = this.engineType;
        transmission = this.transmission;
        cost = this.cost;
        milage = this.milage;
    }

    private generateVIN(){
        /**
         * Get random charactor without getting "I" or "O". Using private char charactor variable
         */
        private char character;

        private randomNum;//Random Number 0 - 9
        private numberToString;
        private String[] storer = new String[17];
        Random rand = new Random();
        for (int i = 0; i < 18; i++){
            if i = 1{
                randomNum = ThreadLocalRandom.current().nextInt(0, 9);//Random Number 0 - 9
                vin += String.valueOf(randomNum); //Convert int into string
            } else if (i >= 3){
                do{
                    character = (char) ('A' + ThreadLocalRandom.current().nextInt(26)); // A-Z
                }while (character == 'I' || c == 'O'); // Skip 'I' and 'O'
                vin += c
            }
        }
    }
}