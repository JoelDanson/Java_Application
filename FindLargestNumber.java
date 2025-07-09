public class FindLargestNumber {
	
	    public static void main(String[] args) {
        int largest = findLargest(10, 20, 30);
        System.out.println("Largest: " + largest);
    }
	
    public static int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= a && b >= c) return b;
        return c;
    }

}