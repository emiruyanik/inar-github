package week_03.assignments;

import java.util.Scanner;

public class Question_03_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature between -58F and 41F");
        double fahrenheit = input.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        if ((-58<fahrenheit && fahrenheit<41) && windSpeed>=2){
            double wc = 35.74 + (0.6215 * fahrenheit) - (35.75) * Math.pow( windSpeed, 0.16) +(0.4275 * fahrenheit * Math.pow(windSpeed, 0.16) );
            System.out.println("The wind chill index is " + wc);

        }
        else {
            System.out.println("The temperature is invalid");
        }

    }
}
