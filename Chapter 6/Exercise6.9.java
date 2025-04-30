public class Exercise06_09 {
    public static void main(String[] args) {
        System.out.println("Feet	Meters	|	Meters	Feet");
        for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5) {
            System.out.printf("%.1f	%.3f	|	%.1f	%.3f%n", feet, footToMeter(feet), meters, meterToFoot(meters));
        }
    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return meter / 0.305;
    }
}