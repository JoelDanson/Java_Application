public class Exercise06_07 {
    public static void main(String[] args) {
        final int END = 100;
        System.out.println("The number of prime numbers less than or equal to " + END + " is " + countPrimes(END));
    }

    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}