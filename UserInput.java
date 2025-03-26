
import java.util.Scanner;

public class UserInput{
    public static void main(String[] args){
		
		     Scanner input = new Scanner(System.in);
			 
			 System.out.print("Whats your name?: ");
			 String name = input.nextLine();
			 
			 System.out.print("Enter Gender (M/F): ");
			 char gender = input.next().charAt(0);
			 
			 input.nextLine();
			 
			 System.out.print("Whats your adress?: ");
			 String adress = input.nextLine();
			 
			 System.out.print("Whats your age?: ");
			 byte age = input.nextByte();
			 
			 System.out.print(" Enter your balance: ");
			 double balance = input.nextDouble();
			 
			 System.out.print("Do you love Java? (True/False)");
			 boolean isJava = input.nextBoolean();
			 
			 System.out.println();
			 System.out.printf("Hello %s, You are welcome to First Bank%n",name);
			 System.out.printf("You are living in %s%n ",adress);
			 System.out.printf("You are %d years old%n",age);
			 System.out.printf("Your account balance is %c%.2f%n",'$',balance);
			 System.out.printf("%s, Do you love Java? %b",name,isJava);
	}
}
		