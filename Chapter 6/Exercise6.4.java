public class Exercise06_04 {
    public static void main(String[] args) {
        System.out.println("Reverse of 12345 is " + reverse(12345));
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