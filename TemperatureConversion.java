import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Use the formula: (°C × 9/5) + 32
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Output result in the specified format
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");

        scanner.close();
    }
}