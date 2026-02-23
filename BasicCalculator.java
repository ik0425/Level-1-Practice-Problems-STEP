import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input number 1
        System.out.print("Enter number 1: ");
        double number1 = scanner.nextDouble();

        // Input number 2
        System.out.print("Enter number 2: ");
        double number2 = scanner.nextDouble();

        // Perform Arithmetic Operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Print result in the specified format
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
            + number1 + " and " + number2 + " is " 
            + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        
        scanner.close();
    }
}