public class Exercise06_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount       Commission");
        System.out.println("------------------------------");
        for (int sales = 10000; sales <= 100000; sales += 5000) {
            double commission = computeCommission(sales);
            System.out.printf("%-20d%.2f%n", sales, commission);
        }
    }

    public static double computeCommission(double salesAmount) {
        double commission = 0;
        if (salesAmount > 10000)
            commission += (salesAmount - 10000) * 0.12;
        if (salesAmount > 5000)
            commission += (Math.min(salesAmount, 10000) - 5000) * 0.10;
        commission += Math.min(salesAmount, 5000) * 0.08;
        return commission;
    }
}
