public class ProfitLossCalculator {
    public static void main(String[] args) {
        // Given values
        double costPrice = 129;
        double sellingPrice = 191;

        // Calculations
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;

        // Output using a single print statement with newline characters (\n)
        System.out.printf("The Cost Price is INR 129 and Selling Price is INR 191\nThe Profit is INR %.0f and the Profit Percentage is %.2f%%\n", 
                          profit, profitPercentage);
    }
}