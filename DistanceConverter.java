import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get input in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // 2. Convert feet to yards (1 yard = 3 feet)
        double yards = distanceInFeet / 3;

        // 3. Convert yards to miles (1 mile = 1760 yards)
        double miles = yards / 1760;

        // 4. Output the result
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);

        scanner.close();
    }
}