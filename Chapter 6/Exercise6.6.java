public class Exercise06_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 100;
        final int PER_LINE = 10;
        int count = 0;
        int number = 2;
        while (count < NUMBER_OF_PRIMES) {
            if (isPrime(number)) {
                count++;
                if (count % PER_LINE == 0)
                    System.out.println(number);
                else
                    System.out.print(number + " ");
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) return false;
        }
        return true;
    }
}