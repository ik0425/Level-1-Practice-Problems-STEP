import java.util.Scanner;

public class IncomeCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // 1. Create a variable named salary and take user input
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        // 2. Create another variable bonus and take user input
        System.out.print("Enter Bonus: ");
        double bonus = scanner.nextDouble();

        // 3. Compute income by adding salary and bonus
        double totalIncome = salary + bonus;

        // 4. Print the result in the specified format
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);

        scanner.close();
    }
}