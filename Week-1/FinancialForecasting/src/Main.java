public class Main {

    public static void main(String[] args) {

        double initialAmount = 10000;
        double annualGrowthRate = 0.10; // 10%
        int years = 5;

        double futureValue = Forecast.forecast(initialAmount, annualGrowthRate, years);

        System.out.printf("Future Value after %d years = %.2f%n", years, futureValue);
    }
}