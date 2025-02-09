import java.math.*;
import java.util.Scanner;

public class KinematicEquationsVargasRyan {

    /**CASE 1`
     * Method to calculate the time difference (∆t = t_f - t_i).
     * method should be named calculateTimeDifference
     *
     * @param times An array containing initial time (t_i) and final time (t_f) in
     *              seconds.
     * @return The time difference in seconds.
     */
    // TODO: Implement the calculateTimeDifference method
    public static double calculateTimeDifference(double[] times) {
        return times[1] - times[0];
    }

    /**CASE 2
     * Method to calculate the change in position (∆X = X_f - X_i).
     * method should be named calculatePositionChange
     *
     * @param positions An array containing initial position (X_i) and final
     *                  position (X_f) in meters.
     * @return The change in position in meters.
     */
    // TODO: Implement the calculatePositionChange method
    public static double calculatePositionChange(double[] positions) {
        return positions[1] - positions[0];
    }

    /**CASE 3
     * Method to calculate final velocity using the formula V_f = V_o + a∆t.
     * calculateFinalVelocityUsingTime
     *
     * @param values An array containing initial velocity (V_o), acceleration (a),
     *               initial time (t_i), and final time (t_f).
     * @return The final velocity (V_f) in m/s.
     */
    // TODO: Implement the calculateFinalVelocityUsingTime method
    public static double calculateFinalVelocityUsingTime(double[] values) {
        double dTime = values[3] - values[2];
        return values[0] + (values[1] * dTime);
    }

    /**CASE 4
     * Method to calculate the change in velocity (∆V = V_f - V_i).
     * calculateVelocityChange
     *
     * @param values An array containing initial velocity (V_i) and final velocity
     *               (V_f).
     * @return The change in velocity in m/s.
     */
    // TODO: Implement the calculateVelocityChange method
    public static double calculateVelocityChange(double[] values) {
        return values[1] - values[0];
    }

    /**CASE 5
     * Method to calculate acceleration using the formula a = ∆V / ∆t.
     * calculateAccelerationFromVelocityAndTime
     * @param values An array containing initial
     *               velocity (V_i),
     *               final velocity(V_f),
     *               initial time (t_i),
     *               and final time (t_f).
     * @return The acceleration (a) in m/s².
     */
    // TODO: Implement the calculateAccelerationFromVelocityAndTime method
    public static double calculateAccelerationFromVelocityAndTime(double[] values) {
        double dTime = values[3] - values[2];
        return (values[1] - values[0]) / dTime;

    }

    /**CASE 6
     * Method to calculate total displacement using the formula ∆X = V_o * ∆t + (a
     * ∆t^2) / 2.
     *
     * @param values An array containing initial velocity (V_o), acceleration (a),
    initial time (t_i), and final time (t_f).
     * @return The total displacement (∆X) in meters.
     */
    // TODO: Implement the calculateDisplacementWithAcceleration method
    public static double calculateDisplacementWithAcceleration(double[] values) {
        double dTime = values[3] - values[2];
        return (values[0] * dTime) + ((values[1] * Math.pow(dTime, 2) / 2));
    }

    /**CASE 7

     * - calculateAccelerationUsingDisplacement Method to calculate total
     displacement using the formula ∆X = V_o * ∆t + (a * t^2) / 2.
     * Method to calculate total displacement using the formula ∆X = V_o * ∆t + (a * t^2) / 2.
     *
     * @param values An array containing:
     * - initialVelocity (V_o) in m/s
     * - initialPosition (X_o) in m
     * - finalPosition (X_f) in m
     * - initialTime (t_i) in seconds
     * - finalTime (t_f) in seconds
     * @return The acceleration (a) in m/s².
     **/
    public static double calculateAccelerationUsingDisplacement(double[] values) {
        double dTime = values[4] - values[3];
        double dPosition = values[2] - values[1];
        return (2 * (dPosition - (values[0] * dTime))) / (dTime * dTime);
    }

    /**CASE 8
     * - calculateFinalPositionUsingAcceleration Method to calculate final position
     using the formula ∆X = V_o * ∆t + (a * t^2) / 2.
     * Method to calculate final position using the formula X_f = V_o * ∆t + (a * t^2) / 2 + X_i.
     *
     * @param values An array containing:
     * - initialVelocity (V_o) in m/s
     * - acceleration (a) in m/s²
     * - initialTime (t_i) in seconds
     * - finalTime (t_f) in seconds
     * - initialPosition (X_i) in meters
     * @return The final position (X_f) in meters..
     **/
    public static double calculateFinalPositionUsingAcceleration(double[] values) {
        double dTime = values[4] - values[3];
        return (values[0] * dTime) + (0.5 * values[1] * Math.pow(dTime, 2)) + values[4];
    }

     /**CASE 9
     * - calculateDisplacementUsingVelocity Method to calculate total displacement
     using the formula ∆X = (V_f + V_o) / 2 * ∆t.
      * Method to calculate total displacement using the formula ∆X = (V_f + V_o) / 2 * ∆t.
      *
      * @param values An array containing:
      * - initialVelocity (V_o) in m/s
      * - finalVelocity (V_f) in m/s
      * - initialTime (t_i) in seconds
      * - finalTime (t_f) in seconds
      * @return The total displacement (∆X) in meters.

      **/
     public static double calculateDisplacementUsingVelocity(double[] values) {
         double dTime = values[3] - values[2];
         return ((values[1] + values[0]) / 2) * dTime;
     }

     /**CASE 10
     * - calculateFinalPositionUsingVelocity Method to calculate final position
     using the formula ∆X = (V_f + V_o) / 2 * ∆t.
      * Method to calculate final position using the formula X_f = (V_f + V_o) / 2 * ∆t + X_i.
      *
      * @param values An array containing:
      * - initialVelocity (V_o) in m/s
      * - finalVelocity (V_f) in m/s
      * - initialTime (t_i) in seconds
      * - finalTime (t_f) in seconds
      * - initialPosition (X_i) in meters
      * @return The final position (X_f) in meters.
      **/
     public static double calculateFinalPositionUsingVelocity(double[] values) {
         double dTime = values[3] - values[2];
         return ((values[1] + values[0]) / 2) * dTime + values[4];
     }

     /**CASE 11
     * - calculateFinalVelocityUsingPosition Method to calculate final velocity
     using the formula ∆V^2 = V_o^2 + 2 * a * ∆X.
      * Method to calculate final velocity using the formula V_f = sqrt(V_o^2 + 2 * a * ∆X).
      *
      * @param values An array containing:
      * - initialVelocity (V_o) in m/s
      * - acceleration (a) in m/s²
      * - initial Position (X_o) in meters
      * - final Position (X_f) in meters
      *
      * @return The final velocity (V_f) in m/s.
      **/
     public static double calculateFinalVelocityUsingPosition(double[] values) {
         return Math.sqrt(Math.pow(values[0], 2) + (2 * values[1] * (values[3] - values[2])));
     }

     /**CASE 12
     * - calculateAccelerationUsingVelocityAndDisplacement
      * Method to calculate acceleration given initial velocity, final velocity, and displacement.
      * calculate acceleration using formula: Vf^2 = Vo + 2a * detla X
      * @param values An array containing:
      * - initialVelocity (V_o) in m/s
      * - finalVelocity (V_f) in m/s
      * - initial Position (X_o) in meters
      * - final Position (X_f) in meters
      * @return The acceleration (a) in m/s².
      **/
     public static double calculateAccelerationUsingVelocityAndDisplacement(double[] values) {
         return (Math.pow(values[1], 2) - Math.pow(values[0], 2)) / (2 * (values[3] - values[2]));
     }
     /**
     * - calculateTimeFromDisplacement
      ** Method to calculate time for an object to fall given the displacement and acceleration.
      * * t = sqrt(2∆X /a)
      * * @param values An array containing:
      * * - initial position (X_o) in meters
      * * - final position (X_f) in meters
      * * - acceleration (a) in m/s²
      * * @return The time (t) in seconds.
     **/
     public static double calculateTimeFromDisplacement(double[] values) {
         return Math.sqrt((2 * Math.abs(values[1] - values[0])) / values[2]);
     }
     /**
     * Follow the format of the above TODOs to implement the methods. Each method
     should be documented with Javadoc comments.
     */
     public static void displayQuestions(int selection, Scanner scanner) {
         switch (selection) {
             case 1:
                 System.out.println("An airplane accelerates down a runway at 3.20 m/s² for 32.8 s until it finally lifts off the ground. Determine the distance traveled before takeoff.");
                 System.out.print("Enter initial velocity (m/s): ");
                 double initialVelocity = scanner.nextDouble();
                 System.out.print("Enter acceleration (m/s²): ");
                 double acceleration = scanner.nextDouble();
                 System.out.print("Enter initial time (s): ");
                 double initialTime = scanner.nextDouble();
                 System.out.print("Enter final time (s): ");
                 double finalTime = scanner.nextDouble();
                 double[] values = {initialVelocity, acceleration, initialTime, finalTime};
                 double displacement = calculateDisplacementWithAcceleration(values);
                 System.out.printf("Displacement: %.2f meters%n", displacement);
                 System.out.println("Correct answer: 1721.34 meters");
                 break;
             case 2:
                 System.out.println("A car starts from rest and accelerates uniformly over a time of 5.21 seconds for a distance of 110 m. Determine the acceleration of the car.");
                 System.out.print("Enter initial velocity (m/s): ");
                 initialVelocity = scanner.nextDouble();
                 System.out.print("Enter initial position (m): ");
                 double initialPosition = scanner.nextDouble();
                 System.out.print("Enter final position (m): ");
                 double finalPosition = scanner.nextDouble();
                 System.out.print("Enter initial time (s): ");
                 initialTime = scanner.nextDouble();
                 System.out.print("Enter final time (s): ");
                 finalTime = scanner.nextDouble();
                 double[] valuesCar = {initialVelocity, initialPosition, finalPosition, initialTime, finalTime};
                 double accelerationCar = calculateAccelerationUsingDisplacement(valuesCar);
                 System.out.printf("Acceleration: %.2f m/s²%n", accelerationCar);
                 System.out.println("Correct answer: 8.10 m/s²");
                 break;
             case 3:
                 System.out.println("A guest is riding the Giant Drop at Great America. If the guest free falls for 2.60 seconds, determine his final velocity and how far he will fall.");
                 System.out.print("Enter initial velocity (m/s): ");
                 initialVelocity = scanner.nextDouble();
                 System.out.print("Enter acceleration due to gravity (m/s²): ");
                 acceleration = scanner.nextDouble();
                 System.out.print("Enter initial time (s): ");
                 initialTime = scanner.nextDouble();
                 System.out.print("Enter final time (s): ");
                 finalTime = scanner.nextDouble();
                 double[] valuesDrop = {initialVelocity, acceleration, initialTime, finalTime};
                 double finalVelocityDrop = calculateFinalVelocityUsingTime(valuesDrop);
                 double displacementDrop = calculateDisplacementWithAcceleration(valuesDrop);
                 System.out.printf("Final velocity: %.2f m/s%n", finalVelocityDrop);
                 System.out.printf("Displacement: %.2f meters%n", displacementDrop);
                 break;
             case 4: //WORKING ON THIS ONE NOWW
                 System.out.println("A race car accelerates uniformly from 18.5 m/s  to 46.1 m/s in 2.47 seconds. Determine the acceleration of the car and the distance traveled.");
                 System.out.print("Enter initial velocity (m/s): ");
                 initialVelocity = scanner.nextDouble();
                 System.out.print("Enter final velocity (m/s): ");
                 double finalVelocity = scanner.nextDouble();
                 System.out.print("Enter initial time (s): ");
                 initialTime = scanner.nextDouble();
                 System.out.print("Enter final time (s): ");
                 finalTime = scanner.nextDouble();

                 double[] valuesDisplacement = {initialVelocity, finalVelocity, initialTime, finalTime};
                 double[] valuesAcceleration = {initialVelocity, finalVelocity, initialTime, finalTime};
                 double accelerationChange = calculateAccelerationFromVelocityAndTime(valuesAcceleration);
                 double displacementChange = calculateDisplacementUsingVelocity(valuesDisplacement);
                 System.out.printf("Acceleration change: %.2f m/s%n", accelerationChange);
                 System.out.printf("Displacement change: %.2f m/s%n", displacementChange);
                 System.out.println("Correct answer: 11.17 m/s², 79.78 meters");
                 break;
             case 5:
                 System.out.println("A feather is dropped on the moon from a height of 1.40 meters. The acceleration due to gravity on the moon is estimated at 1.67 m/s². Determine the time for the feather to fall to the surface of the moon.");
                 System.out.print("Enter initial position (m): ");
                 initialPosition = scanner.nextDouble();
                 System.out.print("Enter final position (m): ");
                 finalPosition = scanner.nextDouble();
                 System.out.print("Enter acceleration (m/s^2): ");
                 acceleration = scanner.nextDouble();
                 double[] valuesFeather = {initialPosition, finalPosition, acceleration};
                 double timeFeather = calculateTimeFromDisplacement(valuesFeather);
                 System.out.printf("Time to fall: %.2f seconds%n", timeFeather);
                 System.out.println("Correct answer: 1.29 seconds");
                 break;
             case 6:
                 System.out.println("A rocket-powered sled is accelerated to a speed of 444 m/s in 1.83 seconds. Determine the acceleration and the distance traveled.");
                 System.out.print("Enter initial velocity (m/s): ");
                 initialVelocity = scanner.nextDouble();
                 System.out.print("Enter final velocity (m/s): ");
                 finalVelocity = scanner.nextDouble();
                 System.out.print("Enter initial time (s): ");
                 initialTime = scanner.nextDouble();
                 System.out.print("Enter final time (s): ");
                 finalTime = scanner.nextDouble();
                 double[] valuesSled = {initialVelocity, finalVelocity, initialTime, finalTime};
                 double accelerationSled = calculateAccelerationFromVelocityAndTime(valuesSled);
                 double displacementSled = calculateDisplacementUsingVelocity(valuesSled);
                 System.out.printf("Acceleration: %.2f m/s²%n", accelerationSled);
                 System.out.printf("Displacement: %.2f meters%n", displacementSled);
                 break;
             case 7:
                 System.out.println("A vehicle accelerates over time. Determine its acceleration using displacement.");
                 System.out.print("Enter initial velocity (m/s): ");
                 initialVelocity = scanner.nextDouble();
                 System.out.print("Enter initial position (m): ");
                 initialPosition = scanner.nextDouble();
                 System.out.print("Enter final position (m): ");
                 finalPosition = scanner.nextDouble();
                 System.out.print("Enter initial time (s): ");
                 initialTime = scanner.nextDouble();
                 System.out.print("Enter final time (s): ");
                 finalTime = scanner.nextDouble();
                 double[] valuesAccelerations = {initialVelocity, initialPosition, finalPosition, initialTime, finalTime};
                 acceleration = calculateAccelerationUsingDisplacement(valuesAccelerations);
                 System.out.printf("Acceleration: %.2f m/s²%n", acceleration);
                 break;
             case 8:
                 System.out.println("A sprinter starts with an initial velocity of 2.0 m/s and accelerates at 1.5 m/s² for 6.0 s. Determine the final velocity.");
                 System.out.print("Enter initial velocity (m/s): ");
                 initialVelocity = scanner.nextDouble();
                 System.out.print("Enter acceleration (m/s²): ");
                 acceleration = scanner.nextDouble();
                 System.out.print("Enter initial time (s): ");
                 initialTime = scanner.nextDouble();
                 System.out.print("Enter final time (s): ");
                 finalTime = scanner.nextDouble();
                 double[] valuesSprinter = {initialVelocity, acceleration, initialTime, finalTime};
                 double finalVelocitySprinter = calculateFinalVelocityUsingTime(valuesSprinter);
                 System.out.printf("Final velocity: %.2f m/s%n", finalVelocitySprinter);
                 break;
             case 9:
                 System.out.println("A truck accelerates uniformly from 5.0 m/s to 20.0 m/s over a period of 4.0 seconds. What is the truck's acceleration?");
                 System.out.print("Enter initial velocity (m/s): ");
                 initialVelocity = scanner.nextDouble();
                 System.out.print("Enter final velocity (m/s): ");
                 finalVelocity = scanner.nextDouble();
                 System.out.print("Enter initial time (s): ");
                 initialTime = scanner.nextDouble();
                 System.out.print("Enter final time (s): ");
                 finalTime = scanner.nextDouble();
                 double[] valuesTruck = {initialVelocity, finalVelocity, initialTime, finalTime};
                 double accelerationTruck = calculateAccelerationFromVelocityAndTime(valuesTruck);
                 System.out.printf("Acceleration: %.2f m/s²%n", accelerationTruck);
                 break;
             case 10:
                 System.out.println("A train starts 50 meters from the train yard traveling at 15 m/s and accelerates to 25 m/s over a period of 10.0 seconds. What is the train's final position?");
                 System.out.print("Enter initial velocity (m/s): ");
                 initialVelocity = scanner.nextDouble();
                 System.out.print("Enter final velocity (m/s): ");
                 finalVelocity = scanner.nextDouble();
                 System.out.print("Enter initial time (s): ");
                 initialTime = scanner.nextDouble();
                 System.out.print("Enter final time (s): ");
                 finalTime = scanner.nextDouble();
                 System.out.print("Enter initial position (m): ");
                 initialPosition = scanner.nextDouble();
                 double[] valuesTrain = {initialVelocity, finalVelocity, initialTime, finalTime, initialPosition};
                 double finalPositionTrain = calculateFinalPositionUsingVelocity(valuesTrain);
                 System.out.printf("Final position: %.2f meters%n", finalPositionTrain);
                 break;
             case 11:
                 System.out.println("A car accelerates uniformly over a given distance. Determine the final velocity.");
                 System.out.print("Enter initial velocity (m/s): ");
                 initialVelocity = scanner.nextDouble();
                 System.out.print("Enter acceleration (m/s²): ");
                 acceleration = scanner.nextDouble();
                 System.out.print("Enter initial position (m): ");
                 initialPosition = scanner.nextDouble();
                 System.out.print("Enter final position (m): ");
                 finalPosition = scanner.nextDouble();
                 double[] valuesCars = {initialVelocity, acceleration, initialPosition, finalPosition};
                 double finalVelocityCar = calculateFinalVelocityUsingPosition(valuesCars);
                 System.out.printf("Final velocity: %.2f m/s%n", finalVelocityCar);
                 break;
             case 12:
                 System.out.println("A moving object covers a certain distance. Determine the acceleration using velocity and displacement.");
                 System.out.print("Enter initial velocity (m/s): ");
                 initialVelocity = scanner.nextDouble();
                 System.out.print("Enter final velocity (m/s): ");
                 finalVelocity = scanner.nextDouble();
                 System.out.print("Enter initial position (m): ");
                 initialPosition = scanner.nextDouble();
                 System.out.print("Enter final position (m): ");
                 finalPosition = scanner.nextDouble();
                 double[] valuesAccelerationDisplacement = {initialVelocity, finalVelocity, initialPosition, finalPosition};
                 double accelerationDisplacement = calculateAccelerationUsingVelocityAndDisplacement(valuesAccelerationDisplacement);
                 System.out.printf("Acceleration: %.2f m/s²%n", accelerationDisplacement);
                 break;
             default:
                 System.out.println("Invalid selection. Please enter a valid question number (1-12).");
                 break;
         }
     }

    public static void main(String[] args) {
        System.out.println("Kinematic Equations and Questions");
        Scanner scanner = new Scanner(System.in);
        int selection;
        do {
            System.out.println("\nSelect a question:");
            System.out.println("1. Airplane acceleration and displacement");
            System.out.println("2. Car acceleration and displacement");
            System.out.println("3. Free Fall");
            System.out.println("4. Race car acceleration and displacement");
            System.out.println("5. Feather dropped on the moon");
            System.out.println("6. Rocket-powered sled");
            System.out.println("7. Bike acceleration");
            System.out.println("8. Sprinter's final velocity");
            System.out.println("9. Truck acceleration");
            System.out.println("10. Train's final position");
            System.out.println("11. Car's fin  final position with acceleration");
            System.out.println("0. Exit the program");
            System.out.print("Enter your selection (0-12): ");
            selection = scanner.nextInt();
            if (selection == 0) {
                System.out.println("Exiting the program. Goodbye!");
            } else {
                displayQuestions(selection, scanner);
            }
        } while (selection != 0);
        scanner.close();
    }
}