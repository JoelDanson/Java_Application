public class TypeCasting{
    public static void main(String[] args){
		//Widening Type Casting
	    double balance = 58585;
		System.out.printf("Your account balance is %c%f%n",'$',balance);
		
		//Narrowing TypeCasting(ASCII code ? = 63)
		char alpha = '?';
		
		
		int asciiCode = (char)alpha;
		System.out.printf("The ASCII code for ? is %d%n",asciiCode);
		
		double height = 5.8;
		short myHeight = (short)height;
		System.out.printf("My Facuty's Height is %d%n",myHeight);
	}
}
