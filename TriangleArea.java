import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and height in cm
        System.out.print("Enter base in cm: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();

        // Calculate Area in sq cm (1/2 * base * height)
        double areaSqCm = 0.5 * base * height;

        // Convert sq cm to sq in (Divide by 2.54 * 2.54)
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        // Output result
        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f\n", 
                          areaSqIn, areaSqCm);

        scanner.close();
    }
}