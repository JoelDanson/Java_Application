public class Exercise06_02 {
    public static void main(String[] args) {
        System.out.println("Sum of digits in 234 is " + sumDigits(234));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}