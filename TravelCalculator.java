import java.util.Scanner;

public class TravelCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Take user inputs for names and cities
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter From City: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter Via City: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter To City: ");
        String toCity = scanner.nextLine();

        // 2. Take distances in Miles
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (miles): ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (miles): ");
        double viaToFinalCity = scanner.nextDouble();

        // 3. Take time taken (in hours)
        System.out.print("Enter time from " + fromCity + " to " + viaCity + " (hours): ");
        double timeFromToVia = scanner.nextDouble();

        System.out.print("Enter time from " + viaCity + " to " + toCity + " (hours): ");
        double timeViaToFinalCity = scanner.nextDouble();

        // 4. Calculations with Operator Precedence
        // Distance: (Sum of miles) * 1.61 to get Kilometers
        double totalDistanceKm = (fromToVia + viaToFinalCity) * 1.61;

        // Time: (Sum of hours) * 60 to get Minutes
        double totalTimeMinutes = (timeFromToVia + timeViaToFinalCity) * 60;

        // 5. Final Output
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + 
            " to " + toCity + " via " + viaCity + " is " + totalDistanceKm + 
            " km and the Total Time taken is " + totalTimeMinutes + " minutes");

        scanner.close();
    }
}