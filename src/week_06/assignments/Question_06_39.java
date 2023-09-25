package week_06.assignments;

import java.util.Scanner;

public class Question_06_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0 p1 p2:");
        double p0X = input.nextDouble();
        double p0Y = input.nextDouble();

        double p1X = input.nextDouble();
        double p1Y = input.nextDouble();

        double p2X = input.nextDouble();
        double p2Y = input.nextDouble();

       if (leftOfTheLine(p0X,p0Y,p1X,p1Y,p2X,p2Y)){
           System.out.printf("(%.1f,%.1f) is on the left side of the line from (%.1f,%.1f) to(%.1f,%.1f)"
           ,p2X,p2Y,p0X,p0Y,p1X,p1Y);
       }
       if (onTheSameLine(p0X,p0Y,p1X,p1Y,p2X,p2Y)){
           System.out.printf("(%.1f,%.1f) is on the same line from (%.1f,%.1f) to(%.1f,%.1f)"
                   ,p2X,p2Y,p0X,p0Y,p1X,p1Y);
       }
       if (rightOfTheLine(p0X,p0Y,p1X,p1Y,p2X,p2Y)){
           System.out.printf("(%.1f,%.1f) is on the right side of the line  from (%.1f,%.1f) to(%.1f,%.1f)"
                   ,p2X,p2Y,p0X,p0Y,p1X,p1Y);
       }
    }

    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        boolean result = false;
        if (((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0)) > 0) {
            result = true;
        }
        return result;
    }

    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        boolean result = false;
        if (((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0)) == 0) {
            result = true;
        }
        return result;
    }

    public static boolean rightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        boolean result = false;
        if (((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0)) < 0) {
            result = true;
        }
        return result;
    }
}

