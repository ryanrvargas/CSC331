/**
 * PythonConversionVargasRyan.java
 * Program Purpose: This program demonstrates a basic math program converted from Python to Java.
 * It includes functionality for squaring a number and describing whether a number is positive, negative, or zero.
 *
 * @author Ryan Vargas
 * @date January 26, 2025
 * @section CSC 331 - 002 9AM Friday Class
 */

 import java.util.Scanner;

 public class PythonConversionVargasRyan {
 
     /**
      * Squares the given integer.
      * @param n the integer to be squared.
      * @return the square of the given integer.
      * Note: this method avoids using Java's Math.pow to adhere to the conversion requirement.
      */
     public static int square_number(int n) {
         return n * n;
     }
 
     /**
      * Describes whether the given integer is positive, negative, or zero.
      * @param n the integer to be analyzed.
      * @return a string indicating if the number is "Positive Number," "Negative Number," or "Zero."
      */
     public static String describe_number(int n) {
         if (n > 0) {
             return "Positive Number";
         } else if (n < 0) {
             return "Negative Number";
         } else {
             return "Zero";
         }
     }
 
     /**
      * Main method to run the basic math operations program.
      * This method takes user input for a number, calculates its square, and describes the number's nature.
      */
     public static void main(String[] args) {
         //Scanner class to take user input
         Scanner scanner = new Scanner(System.in);
         System.out.println("This program performs basic math operations.");
 
         //Input and process a number
         System.out.print("Enter a number: ");
         int num = scanner.nextInt();
 
         //Output results
         System.out.println("The square of " + num + " is " + square_number(num) +"\nThe number is " + describe_number(num));
 
 
     }
 }
 