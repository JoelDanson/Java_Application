public class Exercise06_14 {
    public static void main(String[] args) {
        System.out.printf("%-5s%-10s%n", "i", "m(i)");
        System.out.println("---------------");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-5d%-10.4f%n", i, computePi(i));
        }
    }

    public static double computePi(int terms) {
        double sum = 0;
        for (int i = 0; i < terms; i++) {
            sum += Math.pow(-1, i) / (2 * i + 1);
        }
        return 4 * sum;
    }
}
