public class Exercise06_13 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-15s%n", "i", "m(i)");
        System.out.println("----------------------");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-10d%-15.4f%n", i, computeSeries(i));
        }
    }

    public static double computeSeries(int i) {
        double sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += j / (j + 1.0);
        }
        return sum;
    }
}
