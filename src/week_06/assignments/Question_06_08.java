package week_06.assignments;

public class Question_06_08 {
    public static void main(String[] args) {
        System.out.printf("%-13s %-13s |    %-13s %-13s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");

        double celsius = 40.0;
        double fahrenheit = 120.0;
        for (int i = 0; i < 10; i++) {

            System.out.printf("%-13.2f %-13.2f |    %-13.2f %-13.2f\n", celsius, celsiusToFahrenheit(celsius)
                    , fahrenheit, fahrenheitToCelsius(fahrenheit));

            celsius--;
            fahrenheit -= 10.0;

        }

    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
