public class Exercise06_01 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100) + 1;
        }
        System.out.println("The number of numbers >= 50: " + count(numbers, 50));
    }

    public static int count(int[] numbers, int threshold) {
        int count = 0;
        for (int number : numbers) {
            if (number >= threshold) count++;
        }
        return count;
    }
}