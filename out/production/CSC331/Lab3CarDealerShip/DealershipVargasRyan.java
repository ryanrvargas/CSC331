import Lab3CarDealerShip.VehicleVargasRyan;

import java.util.Scanner;

public class DealershipVargasRyan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VehicleVargasRyan Car1 = new VehicleVargasRyan("BMW", "435i", 2015, "Gas", "Manual", 25000, 68000);
        System.out.println(Car1.getVin());
    }
}