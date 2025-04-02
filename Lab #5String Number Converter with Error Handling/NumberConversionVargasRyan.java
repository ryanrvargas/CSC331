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
        else if (s.equals("twentyone") || s.equals("twent-one")) return 21;
        else if (s.equals("twentytwo") || s.equals("twent-two")) return 22;
        else if (s.equals("twentythree") || s.equals("twent-three")) return 23;
        else if (s.equals("twentyfour") || s.equals("twent-four")) return 24;
        else if (s.equals("twentyfive") || s.equals("twent-five")) return 25;
        else if (s.equals("twentysix") || s.equals("twent-six")) return 26;
        else if (s.equals("twentyseven") || s.equals("twent-seven")) return 27;
        else if (s.equals("twentyeight") || s.equals("twent-eight")) return 28;
        else if (s.equals("twentynine") || s.equals("twent-nine")) return 29;
        else{
            throw new IllegalArgumentException("Number out of range.");
        }
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