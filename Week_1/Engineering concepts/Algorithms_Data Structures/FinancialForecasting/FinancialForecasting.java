import java.util.*;

public class FinancialForecasting {
    private static Map<Integer, Double> memo = new HashMap<>();

    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        } else if (memo.containsKey(years)) {
            return memo.get(years);
        }
        double futureValue = calculateFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
        memo.put(years, futureValue);
        return futureValue;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Initial Value: ");
        double presentValue = scan.nextDouble();
        System.out.print("Enter the growth rate (in decimal): ");
        double growthRate = scan.nextDouble();
        System.out.print("Enter the number of years to project: ");
        int years = scan.nextInt();
        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.printf("Future Value after %d years: %.2f%n", years, futureValue);
    }
}
