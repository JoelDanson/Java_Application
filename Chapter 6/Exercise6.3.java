public class Exercise06_03 {
    public static void main(String[] args) {
        System.out.println("Is 121 a palindrome? " + isPalindrome(121));
        System.out.println("Is 123 a palindrome? " + isPalindrome(123));
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }
}