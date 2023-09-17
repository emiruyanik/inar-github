package week_06.assignments;

public class Question_06_09 {
    public static void main(String[] args) {
        System.out.printf("%-8s %-10s | %-10s %-8s\n", "Feet", "Meters", "Meters", "Feet");

        double feet = 1.0;
        double meter = 20.0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-8.1f %-10.3f | %-10.1f %-8.3f\n", feet, footToMeter(feet), meter, meterToFeet(meter));
            feet += 1.0;
            meter += 5.0;
        }
    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFeet(double meter) {
        return 3.279 * meter;
    }
}
