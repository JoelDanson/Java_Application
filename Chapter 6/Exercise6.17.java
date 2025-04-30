public class Exercise06_17 {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;
        int count = 0;

        for (int i = 200; i <= 1000; i++) {
            if (isPalindrome(i)) {
                count++;
                System.out.print(i + (count % NUMBERS_PER_LINE == 0 ? "\n" : " "));
            }
        }
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }
}
