import java.util.Scanner;

public class Pedometer {
    public static double stepsToMiles(int steps) throws Exception {
        if (steps < 0) {
            throw new Exception("Exception: Negative step count entered.");
        }
        // 2,000 steps represent 1 mile
        return steps / 2000.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the number of steps: ");
            int steps = scanner.nextInt();

            double miles = stepsToMiles(steps);

            // Output the result with two decimal places
            System.out.printf("%.2f miles%n", miles);
        } catch (Exception e) {
            // Catch and print any exception thrown by stepsToMiles()
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
