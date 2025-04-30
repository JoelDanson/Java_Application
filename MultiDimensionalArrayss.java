public class MultiDimensionalArrayss{
	public static void main(String[] args){
		
		int[][] numbers ={
			            {31,15,20,16},
			            {45,12,34,35},
			            {18,17,54,28}
		                };
        int evenSum = 0;
        int oddCount = 0;

        // Loop through each element in the array
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                int value = numbers[row][col];
                if (value % 2 == 0) {
                    evenSum += value;
                } else {
                    oddCount++;
                }
            }
        }

        // Output the results
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Count of odd numbers: " + oddCount);
    }
}