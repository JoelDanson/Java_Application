
import java.util.Scanner;

public class UserInput{
    public static void main(String[] args){
		
		     Scanner input = new Scanner(System.in);
			 
			 System.out.print("Whats your name?: ");
			 String name = input.nextLine();
			 
			 System.out.print("Whats your adress?: ");
			 String adress = input.nextLine();
			 
			 System.out.print("Whats your age?: ");
			 byte age = input.nextByte();
			 
			 System.out.println();
			 System.out.printf("Hello %s, You are welcome to First Bank%n",name);
			 System.out.printf("You are living in %s%n ",adress);
			 System.out.printf("You are %d years old",age);
	}
}
		