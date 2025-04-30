public class Exercise06_16 {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                count++;
                System.out.print(i + (count % NUMBERS_PER_LINE == 0 ? "\n" : " "));
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
