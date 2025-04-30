import java.util.Scanner;

public class Exercise06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two strings: ");
        String s1 = input.next();
        String s2 = input.next();
        System.out.println(s1 + " and " + s2 + " is " + (isPrefix(s1, s2) ? "" : "not ") + "a prefix");
    }

    public static boolean isPrefix(String s1, String s2) {
        return s2.startsWith(s1);
    }
}