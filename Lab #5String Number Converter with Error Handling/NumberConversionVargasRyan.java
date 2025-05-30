import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * NumberConversionVargasRyan
 * A utility program that converts numbers between word form and integer values (0–29).
 * It includes a menu-driven interface and input validation using if-else logic.
 * No arrays, maps, or switch statements are used as per lab requirements.
 *
 * Author: Ryan Vargas
 * Date: 04/02/2025
 * Section: 331-002
 */
public class NumberConversionVargasRyan {

    /**
     * Converts a number (0–29) to its corresponding word form.
     *
     * @param num the number to convert
     * @return the number in word form (e.g., "twenty-three")
     * @throws IllegalArgumentException if the number is outside the range 0–29
     */
    public static String convertNumberToString(int num) {
        String result = "";

        if (num < 0 || num > 29) {
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

    /**
     * Converts a word-form number (e.g., "twenty-three") into its integer value (e.g., 23).
     * Handles both hyphenated and concatenated formats (e.g., "twentythree").
     *
     * @param s the word-form number to convert
     * @return the integer value of the number
     * @throws IllegalArgumentException if the word is invalid or out of range
     */
    public static int convertWordToNumber(String s) {
        s = s.strip().toLowerCase();

        if (s.equals("zero")) return 0;
        else if (s.equals("one")) return 1;
        else if (s.equals("two")) return 2;
        else if (s.equals("three")) return 3;
        else if (s.equals("four")) return 4;
        else if (s.equals("five")) return 5;
        else if (s.equals("six")) return 6;
        else if (s.equals("seven")) return 7;
        else if (s.equals("eight")) return 8;
        else if (s.equals("nine")) return 9;
        else if (s.equals("ten")) return 10;
        else if (s.equals("eleven")) return 11;
        else if (s.equals("twelve")) return 12;
        else if (s.equals("thirteen")) return 13;
        else if (s.equals("fourteen")) return 14;
        else if (s.equals("fifteen")) return 15;
        else if (s.equals("sixteen")) return 16;
        else if (s.equals("seventeen")) return 17;
        else if (s.equals("eighteen")) return 18;
        else if (s.equals("nineteen")) return 19;
        else if (s.equals("twenty")) return 20;
        else if (s.equals("twentyone") || s.equals("twenty-one")) return 21;
        else if (s.equals("twentytwo") || s.equals("twenty-two")) return 22;
        else if (s.equals("twentythree") || s.equals("twenty-three")) return 23;
        else if (s.equals("twentyfour") || s.equals("twenty-four")) return 24;
        else if (s.equals("twentyfive") || s.equals("twenty-five")) return 25;
        else if (s.equals("twentysix") || s.equals("twenty-six")) return 26;
        else if (s.equals("twentyseven") || s.equals("twenty-seven")) return 27;
        else if (s.equals("twentyeight") || s.equals("twenty-eight")) return 28;
        else if (s.equals("twentynine") || s.equals("twenty-nine")) return 29;
        else {
            throw new IllegalArgumentException("Number out of range.");
        }
    }

    /**
     * Displays a menu to the user for converting numbers and handles input and validation.
     * Includes options to convert word-to-number, number-to-word, or exit the program.
     * Handles invalid menu and input values using try/catch.
     */
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
                scanner.nextLine(); // Clear newline

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
                scanner.nextLine(); // Clear invalid input
            }
        }
    }

    /**
     * Main method – entry point of the program.
     * Launches the number conversion menu.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        displayMenu();
    }
}
