public class DataType{
    public static void main(String[] args){
	    //Integer type (byte, short, int,long)
		
		byte age = 50;
		System.out.printf("Your age is %d%n",age);
		
		short quantity = 32000;
		System.out.printf("I bought %d quantity of bags for my busniess%n",quantity);
		
		int populationInNigeria = 1000000000;
		System.out.printf("The total population in nigeria ia %d%n",populationInNigeria);
		
		long worldPopulation = 800000000000L;
		System.out.printf("The world population is %d%n",worldPopulation);
		
		//float-point type(float,double)
		float myBalance = 12345.858575F;
		System.out.printf("Your account balance if %f%n",myBalance);
		
		double cbnReserve = 5575857.767676763636;
		System.out.printf("The CBN balance is %.5f%n",cbnReserve);
		
		//Boolean type (boolean)
		boolean isJavaFun = true;
		System.out.printf("Is Java a fun language ? %b%n",isJavaFun);
		
		//Character type(char) used to store only one single piece of character
		char alpha = '@';
		System.out.printf("My email is joeldanson259%cgmail.com",alpha);
	}
}