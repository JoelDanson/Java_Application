import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        
        scanner.close();
        
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);
    }
}
