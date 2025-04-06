//4.11

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of integers: ");
        int count = input.nextInt();
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number: ");
            int num = input.nextInt();
            if (num < smallest)
                smallest = num;
        }

        System.out.println("Smallest number is: " + smallest);
    }
}
