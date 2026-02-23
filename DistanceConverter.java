public class DistanceConverter {
    public static void main(String[] args) {
        // Given values
        double kilometers = 10.8;
        double conversionFactor = 1.6; // Based on your hint: 1 km = 1.6 miles
        
        // Calculate miles
        double miles = kilometers * conversionFactor;
        
        // Output the result in the specified format
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}