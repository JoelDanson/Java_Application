//4.14

public class Interest {
    public static void main(String[] args) {
        double principal = 1000.0;
        int years = 10;

        for (int rate = 5; rate <= 10; rate++) {
            System.out.printf("Interest Rate: %d%%%n", rate);
            for (int year = 1; year <= years; year++) {
                double amount = principal * Math.pow(1 + rate / 100.0, year);
                System.out.printf("Year %2d: %.2f%n", year, amount);
            }
            System.out.println();
        }
    }
}
