package Lab3CarDealerShip;

import java.util.Scanner;

public class DealershipVargasRyan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VehicleVargasRyan BMW = new VehicleVargasRyan();


        System.out.printf("Enter vehicle Vargas: %s", BMW.getVin());
    }
}
