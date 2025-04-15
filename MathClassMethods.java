import java.util.Scanner;

public class MathClassMethods{
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Enter number: ");
		double num = scan.nextDouble();
		
		System.out.printf("The absoulute value is %f%n",Math.abs(num));
		
		System.out.printf("The rounded value is %d%n",Math.round(num));
		
		System.out.printf("%f raised to the power of 2 is %f%n",num,Math.pow(num,2));
		
		System.out.printf("The square root of %d is %f%n",num,Math.sqrt(num));
		System.out.println("-----------------------------------------------");
		
		System.out.print("Enter first number");
		double num1 = scan.nextDouble();
		
		System.out.print("Enter second number");
		double num2 = scan.nextDouble();
		
		System.out.printf("The minimum number is %f%n",Math.min(num1,num2));
		
		System.out.printf("The maximum number is %f%n",Math.max(num1,num2));
		
		System.out.println("------------------------------------------------");
		
		System.out.println("The area of cirlce");
		
		double radius;
		double areaOfCircle;
		
		System.out.print("Enter radius;: ");
		radius = scan.nextDouble();
		
		areaOfCircle = Math.PI * Math.pow(radius,2);
		
		System.out.printf("The area of a cirlce is %.2f%n",areaOfCircle);
		
	}
}