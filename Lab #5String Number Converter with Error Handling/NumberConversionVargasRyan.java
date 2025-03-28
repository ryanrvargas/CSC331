import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberConversionVargasRyan {
    public static void convertNumberToString(int num) {
    }

    public static void convertWordToNumber(String s) {
    }

    public static void displayMenu() {
        System.out.println("Number Conversion Vargas\n" +
                "1) Convert word to number\n" +
                "2) Convert number to word\n" +
                "3) Exit");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {

                System.out.print("Select an option: ");
                int option = scanner.nextInt();
                scanner.nextLine();
                if (option == 1) {
                    convertWordToNumber(scanner.nextLine());
                } else if (option == 2) {
                    convertNumberToString(scanner.nextInt());
                } else if (option == 3) {
                    System.out.println("Exit. See you later");
                    break;
                } else {
                    System.out.println("Invalid option, please try again");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e);
                displayMenu();
            } catch (InputMismatchException e){
                System.out.println("Error: " + e);
                displayMenu();
            }
        }

    }

    public static void main(String[] args) {
        displayMenu();
    }
}