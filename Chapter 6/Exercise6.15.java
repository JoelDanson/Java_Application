public class Exercise06_15 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-15s%n", "Taxable Income", "Tax");
        System.out.println("-------------------------------");
        for (int income = 50000; income <= 60000; income += 50) {
            System.out.printf("%-15d%.2f%n", income, computeTax(income));
        }
    }

    public static double computeTax(int income) {
        double tax = 0;
        int[] brackets = {8350, 33950};
        double[] rates = {0.10, 0.15, 0.25};

        if (income <= brackets[0])
            tax = income * rates[0];
        else if (income <= brackets[1])
            tax = brackets[0] * rates[0] + (income - brackets[0]) * rates[1];
        else
            tax = brackets[0] * rates[0] + (brackets[1] - brackets[0]) * rates[1]
                  + (income - brackets[1]) * rates[2];

        return tax;
    }
}
