import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Create variables and take user input
        System.out.print("Enter number 1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = scanner.nextInt();

        // 2. Swap the numbers using a temporary variable
        int temp = number1; // Store number1 in temp
        number1 = number2;  // Give number2's value to number1
        number2 = temp;     // Give temp's (original number1) value to number2

        // 3. Print the swapped output
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        scanner.close();
    }
}