public class Exercise06_10 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 10) {
            if (isPrime(number)) {
                System.out.printf("%7d", number);
                count++;
                if (count % 5 == 0) System.out.println();
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}