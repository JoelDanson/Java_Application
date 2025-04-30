public class Exercise06_08 {
    public static void main(String[] args) {
        System.out.println("Celsius	Fahrenheit	|	Fahrenheit	Celsius");
        for (int c = 40, f = 120; c >= 31; c--, f -= 10) {
            System.out.printf("%d	%.1f		|	%d		%.2f%n", c, celsiusToFahrenheit(c), f, fahrenheitToCelsius(f));
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}