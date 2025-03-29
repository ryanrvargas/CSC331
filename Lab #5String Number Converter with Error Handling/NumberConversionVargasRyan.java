import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberConversionVargasRyan {
    public static String convertNumberToString(int num) {
        String numStr = String.valueOf(num);
        String result = "";

        if (num < 0 && num > 29) {
            throw new IllegalArgumentException("Number out of range.");
        }

        if (num < 20) {
            if (num == 0) result = "zero";
            else if (num == 1) result = "one";
            else if (num == 2) result = "two";
            else if (num == 3) result = "three";
            else if (num == 4) result = "four";
            else if (num == 5) result = "five";
            else if (num == 6) result = "six";
            else if (num == 7) result = "seven";
            else if (num == 8) result = "eight";
            else if (num == 9) result = "nine";
            else if (num == 10) result = "ten";
            else if (num == 11) result = "eleven";
            else if (num == 12) result = "twelve";
            else if (num == 13) result = "thirteen";
            else if (num == 14) result = "fourteen";
            else if (num == 15) result = "fifteen";
            else if (num == 16) result = "sixteen";
            else if (num == 17) result = "seventeen";
            else if (num == 18) result = "eighteen";
            else if (num == 19) result = "nineteen";
        } else {
            result = "twenty";
            int remainder = num % 10;
            if (remainder == 1) result += "-one";
            else if (remainder == 2) result += "-two";
            else if (remainder == 3) result += "-three";
            else if (remainder == 4) result += "-four";
            else if (remainder == 5) result += "-five";
            else if (remainder == 6) result += "-six";
            else if (remainder == 7) result += "-seven";
            else if (remainder == 8) result += "-eight";
            else if (remainder == 9) result += "-nine";
        }
        return result;
    }

    public static int convertWordToNumber(String s) {
        return 0;
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
                    System.out.print("Enter word: ");
                    System.out.println(convertWordToNumber(scanner.nextLine()));
                } else if (option == 2) {
                    System.out.print("Enter number: ");
                    System.out.println(convertNumberToString(scanner.nextInt()));
                } else if (option == 3) {
                    System.out.println("Exit. See you later");
                    break;
                } else {
                    System.out.println("Invalid option, please try again");
                }
            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }

    }

    public static void main(String[] args) {
        displayMenu();
    }
}