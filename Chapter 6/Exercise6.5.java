public class Exercise06_05 {
    public static void main(String[] args) {
        System.out.println("Number	Reverse");
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d		%d%n", i, reverse(i));
        }
    }

    public static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }
}