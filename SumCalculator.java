import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Accept 10 numbers from the user
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of the sixth to ninth numbers (index 5 to 8)
        int sumSixthToNinth = 0;
        for (int i = 5; i <= 8; i++) {
            sumSixthToNinth += numbers[i];
        }

        // Calculate the sum of the fourth to tenth numbers (index 3 to 9)
        int sumFourthToTenth = 0;
        for (int i = 3; i < 10; i++) {
            sumFourthToTenth += numbers[i];
        }

        // Calculate the difference
        int difference = sumFourthToTenth - sumSixthToNinth;

        // Display the results
        System.out.println("Sum of sixth to ninth numbers: " + sumSixthToNinth);
        System.out.println("Sum of fourth to tenth numbers: " + sumFourthToTenth);
        System.out.println("Difference: " + difference);

        scanner.close();
    }
}
